package com.ma.clothes.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ma.clothes.pojo.ao.AllocationAO;
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

    @Override
    public IPage<AllocationInfo> getAllocationList(AllocationAO allocationAO) {
        Page<AllocationInfo> page = new Page<>();
        page.setCurrent(allocationAO.getPage());
        page.setSize(allocationAO.getRows());
        QueryWrapper<AllocationInfo> queryWrapper = new QueryWrapper<>();
        //判断编号是否有值
        if(allocationAO.getSearchNumber() != null && allocationAO.getSearchNumber() != 0){
            queryWrapper.eq("number", allocationAO.getSearchNumber());
        }
        //判断商品信息是否有值
        if(allocationAO.getSearchMaterial() != null && allocationAO.getSearchMaterial() != ""){
            queryWrapper.like("goods_info", allocationAO.getSearchMaterial());
        }
        //判断时间是否有值
        if(allocationAO.getSearchBeginTime() != null && allocationAO.getSearchBeginTime() != ""
                && allocationAO.getSearchEndTime() != null && allocationAO.getSearchEndTime() != ""){
            queryWrapper.ge("operator_time", allocationAO.getSearchBeginTime());
            queryWrapper.le("operator_time", allocationAO.getSearchEndTime());
        }else if (allocationAO.getSearchBeginTime() != null &&  allocationAO.getSearchBeginTime() != ""){
            queryWrapper.ge("operator_time", allocationAO.getSearchBeginTime());
        }else if (allocationAO.getSearchEndTime() != null && allocationAO.getSearchEndTime() != ""){
            queryWrapper.le("operator_time", allocationAO.getSearchEndTime());
        }

        queryWrapper.orderByDesc("operator_time");

        IPage<AllocationInfo> iPage = allocationInfoMapper.selectPage(page, queryWrapper);

        return iPage;
    }
}
