package com.ma.clothes.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ma.clothes.pojo.ao.AllocationAO;
import com.ma.clothes.pojo.entity.AllocationInfo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author myouj
 * @since 2019-04-06
 */
public interface IAllocationInfoService extends IService<AllocationInfo> {

    int getNewNum();

    IPage<AllocationInfo> getAllocationList(AllocationAO allocationAO);

}
