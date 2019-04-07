package com.ma.clothes.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ma.clothes.pojo.entity.AllocationInfo;
import com.ma.clothes.dao.AllocationInfoMapper;
import com.ma.clothes.service.IAllocationInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author myouj
 * @since 2019-04-06
 */
@Service
public class AllocationInfoServiceImpl extends ServiceImpl<AllocationInfoMapper, AllocationInfo> implements IAllocationInfoService {

    @Autowired
    private AllocationInfoMapper allocationInfoMapper;

    @Override
    public int getNewNum() {
        QueryWrapper<AllocationInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.inSql("number", "select max(number) from allocation_info");
        AllocationInfo allocationInfo = allocationInfoMapper.selectOne(queryWrapper);
        return allocationInfo.getNumber();
    }
}
