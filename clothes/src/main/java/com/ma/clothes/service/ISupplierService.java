package com.ma.clothes.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ma.clothes.pojo.ao.SupplierAO;
import com.ma.clothes.pojo.entity.Supplier;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author myouj
 * @since 2019-04-11
 */
public interface ISupplierService extends IService<Supplier> {

    IPage<Supplier> getList(SupplierAO supplierAO);



}
