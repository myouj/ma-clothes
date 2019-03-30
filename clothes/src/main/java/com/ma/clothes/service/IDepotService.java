package com.ma.clothes.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ma.clothes.pojo.ao.DepotAO;
import com.ma.clothes.pojo.entity.Depot;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author myouj
 * @since 2019-03-30
 */
public interface IDepotService extends IService<Depot> {

    IPage<Depot> getDepotList(DepotAO depotAO);

}
