package com.ma.clothes.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ma.clothes.pojo.ao.FinanceAO;
import com.ma.clothes.pojo.entity.Finance;
import com.ma.clothes.dao.FinanceMapper;
import com.ma.clothes.service.IFinanceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author myouj
 * @since 2019-04-14
 */
@Service
public class FinanceServiceImpl extends ServiceImpl<FinanceMapper, Finance> implements IFinanceService {

    @Autowired
    private FinanceMapper financeMapper;

    @Override
    public IPage<Finance> getList(FinanceAO financeAO) {
        Page<Finance> page = new Page<>();
        page.setCurrent(financeAO.getPage());
        page.setSize(financeAO.getRows());

        QueryWrapper<Finance> queryWrapper = new QueryWrapper<>();
        if(financeAO.getType() != null && !"全部".equals(financeAO.getType())){
            queryWrapper.eq("properties", financeAO.getType());
        }

        queryWrapper.orderByDesc("time");

        IPage<Finance> iPage = financeMapper.selectPage(page, queryWrapper);
        return iPage;
    }
}
