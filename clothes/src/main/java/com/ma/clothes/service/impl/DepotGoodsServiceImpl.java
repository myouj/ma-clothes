package com.ma.clothes.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ma.clothes.pojo.ao.DepotGoodsAO;
import com.ma.clothes.pojo.entity.DepotGoods;
import com.ma.clothes.dao.DepotGoodsMapper;
import com.ma.clothes.service.IDepotGoodsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author myouj
 * @since 2019-04-02
 */
@Service
public class DepotGoodsServiceImpl extends ServiceImpl<DepotGoodsMapper, DepotGoods> implements IDepotGoodsService {

    @Autowired
    private DepotGoodsMapper depotGoodsMapper;

    @Override
    public IPage<DepotGoods> getDepotGoodsList(DepotGoodsAO depotGoodsAO) {
        Page<DepotGoods> depotGoodsPage = new Page<>();
        depotGoodsPage.setCurrent(depotGoodsAO.getPage());
        depotGoodsPage.setSize(depotGoodsAO.getRows());

        QueryWrapper<DepotGoods> depotGoodsQueryWrapper = new QueryWrapper<>();

        if(depotGoodsAO.getDepotNum() != null && depotGoodsAO.getDepotNum() != 0){
            depotGoodsQueryWrapper.eq("depot_num", depotGoodsAO.getDepotNum());
        }
        if(depotGoodsAO.getGoodsNum() != null && depotGoodsAO.getGoodsNum() != 0){
            depotGoodsQueryWrapper.eq("goods_num", depotGoodsAO.getGoodsNum());
        }

        if(depotGoodsAO.getGoodsName() != null && depotGoodsAO.getGoodsName() != ""){
            depotGoodsQueryWrapper.eq("goods_name", depotGoodsAO.getGoodsName());
        }

        IPage<DepotGoods> depotGoodsIPage = depotGoodsMapper.selectPage(depotGoodsPage, depotGoodsQueryWrapper);
        return depotGoodsIPage;
    }
}
