package com.ma.clothes.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ma.clothes.pojo.ao.DepotInfoAO;
import com.ma.clothes.pojo.entity.DepotInfo;
import com.ma.clothes.dao.DepotInfoMapper;
import com.ma.clothes.service.IDepotInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author myouj
 * @since 2019-04-11
 */
@Service
public class DepotInfoServiceImpl extends ServiceImpl<DepotInfoMapper, DepotInfo> implements IDepotInfoService {

    @Autowired
    private DepotInfoMapper depotInfoMapper;

    @Override
    public IPage<DepotInfo> getList(DepotInfoAO depotInfoAO) {
        Page<DepotInfo> page = new Page<>();
        page.setCurrent(depotInfoAO.getPage());
        page.setSize(depotInfoAO.getRows());
        QueryWrapper<DepotInfo> queryWrapper = new QueryWrapper<>();

        //判断时间是否有值
        if(depotInfoAO.getBeginTime() != null && !"".equals(depotInfoAO.getBeginTime())
                && depotInfoAO.getEndTime() != null && !"".equals(depotInfoAO.getEndTime())){
            queryWrapper.ge("operator_time", depotInfoAO.getBeginTime());
            queryWrapper.le("operator_time", depotInfoAO.getEndTime());
        }else if (depotInfoAO.getBeginTime() != null &&  !"".equals(depotInfoAO.getBeginTime())){
            queryWrapper.ge("operator_time", depotInfoAO.getBeginTime());
        }else if (depotInfoAO.getEndTime() != null && !"".equals(depotInfoAO.getEndTime())){
            queryWrapper.le("operator_time", depotInfoAO.getEndTime());
        }

        IPage<DepotInfo> iPage = depotInfoMapper.selectPage(page, queryWrapper);

        return iPage;
    }
}
