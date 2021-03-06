package com.ma.clothes.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ma.clothes.pojo.ao.FinanceAO;
import com.ma.clothes.pojo.entity.Finance;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author myouj
 * @since 2019-04-14
 */
public interface IFinanceService extends IService<Finance> {

    IPage<Finance> getList(FinanceAO financeAO);

}
