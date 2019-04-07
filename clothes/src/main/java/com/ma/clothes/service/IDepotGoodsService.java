package com.ma.clothes.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ma.clothes.pojo.ao.DepotGoodsAO;
import com.ma.clothes.pojo.entity.DepotGoods;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author myouj
 * @since 2019-04-02
 */
public interface IDepotGoodsService extends IService<DepotGoods> {

    IPage<DepotGoods> getDepotGoodsList(DepotGoodsAO depotGoodsAO);

    List<DepotGoods> getDepotGoodsByDnumber(String dnumber);

}
