package com.ma.clothes.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ma.clothes.pojo.ao.SupplierAO;
import com.ma.clothes.pojo.entity.Supplier;
import com.ma.clothes.dao.SupplierMapper;
import com.ma.clothes.service.ISupplierService;
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
public class SupplierServiceImpl extends ServiceImpl<SupplierMapper, Supplier> implements ISupplierService {

    @Autowired
    private SupplierMapper supplierMapper;

    @Override
    public IPage<Supplier> getList(SupplierAO supplierAO) {
        Page<Supplier> page = new Page<>();
        page.setCurrent(supplierAO.getPage());
        page.setSize(supplierAO.getRows());

        QueryWrapper<Supplier> queryWrapper = new QueryWrapper<>();
        if(supplierAO.getSupplier() != null && !"".equals(supplierAO.getSupplier())){
            queryWrapper.like("company", supplierAO.getSupplier());
        }

        if(supplierAO.getManager() != null && !"".equals(supplierAO.getManager())){
            queryWrapper.like("manager", supplierAO.getManager());
        }

        queryWrapper.orderByAsc("num");

        IPage<Supplier> iPage = supplierMapper.selectPage(page, queryWrapper);

        return iPage;
    }
}
