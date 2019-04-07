package com.ma.clothes.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ma.clothes.pojo.ao.GoodsAO;
import com.ma.clothes.pojo.entity.Goods;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author myouj
 * @since 2019-04-01
 */
public interface IGoodsService extends IService<Goods> {

    IPage<Goods> getGoodsList(GoodsAO goodsAO);

    int getNewNumber();

    Goods getGoodsById(String id);

    int updateGoods(Goods goods);

    int insert(Goods goods);

    int deleteGoods(String id);

    void deleteBatchByIds(List<String> list);



}
