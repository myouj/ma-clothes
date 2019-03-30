package com.ma.clothes.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ma.clothes.pojo.ao.DepotAO;
import com.ma.clothes.pojo.entity.Depot;
import com.ma.clothes.dao.DepotMapper;
import com.ma.clothes.service.IDepotService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author myouj
 * @since 2019-03-30
 */
@Service
public class DepotServiceImpl extends ServiceImpl<DepotMapper, Depot> implements IDepotService {

    @Autowired
    private DepotMapper depotMapper;

    @Override
    public IPage<Depot> getDepotList(DepotAO depotAO) {
        Page<Depot> depotPage = new Page<>();
        if(depotAO.getCurrentPage() == null){
            depotPage.setCurrent(1);
            depotPage.setSize(10);
        }else{
            depotPage.setCurrent(depotAO.getCurrentPage());
            depotPage.setSize(depotAO.getPageSize());
        }
        QueryWrapper<Depot> queryWrapper = new QueryWrapper<>();
        if(depotAO.getNum() != null && depotAO.getNum() != 0){
            queryWrapper.eq("num", depotAO.getNum());
        }

        if(depotAO.getAddress() != null && depotAO.getAddress() != ""){
            queryWrapper.like("address", depotAO.getAddress());
        }

        IPage<Depot> depotIPage = depotMapper.selectPage(depotPage, queryWrapper);

        return depotIPage;
    }
}
