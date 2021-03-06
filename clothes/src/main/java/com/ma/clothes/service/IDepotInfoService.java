package com.ma.clothes.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ma.clothes.pojo.ao.DepotInfoAO;
import com.ma.clothes.pojo.entity.DepotInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author myouj
 * @since 2019-04-11
 */
public interface IDepotInfoService extends IService<DepotInfo> {

    IPage<DepotInfo> getList(DepotInfoAO depotInfoAO);

}
