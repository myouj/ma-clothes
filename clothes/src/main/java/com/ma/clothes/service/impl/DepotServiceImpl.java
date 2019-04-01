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
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

        depotPage.setCurrent(depotAO.getPage());
        depotPage.setSize(depotAO.getRows());

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

    @Override
    public int getNewNum() {

        QueryWrapper<Depot> depotQueryWrapper = new QueryWrapper<>();
        depotQueryWrapper.inSql("num", "select max(num) from depot");

        Depot depot = depotMapper.selectOne(depotQueryWrapper);

        return depot.getNum();
    }

    @Override
    public int insertDepot(Depot depot) {
        return depotMapper.insert(depot);
    }

    @Override
    @Transactional
    public int deleteBatchById(List<String> ids) {
        return depotMapper.deleteBatchIds(ids);
    }

    @Override
    public int deleteById(String id) {
        return depotMapper.deleteById(id);
    }

    @Override
    public Depot selectById(String id) {
        return depotMapper.selectById(id);
    }

    @Override
    public int updateDepot(Depot depot) {
        return depotMapper.updateById(depot);
    }
}
