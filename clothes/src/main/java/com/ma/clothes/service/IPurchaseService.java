package com.ma.clothes.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ma.clothes.common.tools.MyException;
import com.ma.clothes.pojo.ao.PurchaseAO;
import com.ma.clothes.pojo.entity.Purchase;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author myouj
 * @since 2019-04-13
 */
public interface IPurchaseService extends IService<Purchase> {

    IPage<Purchase> getList(PurchaseAO purchaseAO);

    int depotPurchase(String id, String operator) throws MyException;

    int outPurchase(String id, String operator) throws MyException;

}
