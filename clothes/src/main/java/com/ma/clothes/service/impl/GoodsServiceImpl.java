package com.ma.clothes.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ma.clothes.pojo.ao.GoodsAO;
import com.ma.clothes.pojo.entity.Goods;
import com.ma.clothes.dao.GoodsMapper;
import com.ma.clothes.service.IGoodsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author myouj
 * @since 2019-04-01
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public IPage<Goods> getGoodsList(GoodsAO goodsAO) {
        Page<Goods> goodsPage = new Page<>();
        goodsPage.setCurrent(goodsAO.getPage());
        goodsPage.setSize(goodsAO.getRows());

        QueryWrapper<Goods> goodsQueryWrapper = new QueryWrapper<>();
        if(goodsAO.getNum() != null && goodsAO.getNum() != 0){
            goodsQueryWrapper.eq("number", goodsAO.getNum());
        }

        if(goodsAO.getName() != null && goodsAO.getName() != ""){
            goodsQueryWrapper.like("name", goodsAO.getName());
        }

        IPage<Goods> goodsIPage = goodsMapper.selectPage(goodsPage, goodsQueryWrapper);

        return goodsIPage;
    }

    @Override
    public int getNewNumber() {

        QueryWrapper<Goods> goodsQueryWrapper = new QueryWrapper<>();
        goodsQueryWrapper.inSql("number", "select max(number) from goods");
        Goods goods = goodsMapper.selectOne(goodsQueryWrapper);
        return goods.getNumber();
    }

    @Override
    public Goods getGoodsById(String id) {
        Goods goods = goodsMapper.selectById(id);
        return goods;
    }

    @Override
    public int updateGoods(Goods goods) {
        return goodsMapper.updateById(goods);
    }

    @Override
    public int insert(Goods goods) {
        return goodsMapper.insert(goods);
    }

    @Override
    public int deleteGoods(String id) {
        return goodsMapper.deleteById(id);
    }

    @Override
    @Transactional
    public void deleteBatchByIds(List<String> list) {
        goodsMapper.deleteBatchIds(list);
    }
}
