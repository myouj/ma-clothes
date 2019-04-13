package com.ma.clothes.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ma.clothes.common.resultutils.EasyUIUtil;
import com.ma.clothes.common.resultutils.ResultUtil;
import com.ma.clothes.common.tools.StringUtils;
import com.ma.clothes.pojo.ao.SupplierAO;
import com.ma.clothes.pojo.entity.Goods;
import com.ma.clothes.pojo.entity.Supplier;
import com.ma.clothes.service.ISupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author myouj
 * @since 2019-04-11
 */
@RestController
@RequestMapping("//supplier")
public class SupplierController {

    @Autowired
    private ISupplierService supplierService;

    @GetMapping("/getList")
    public EasyUIUtil getList(SupplierAO supplierAO){
        IPage<Supplier> serviceList = supplierService.getList(supplierAO);

        int total = (int)serviceList.getTotal();
        int start = (int)serviceList.getCurrent();
        int pageSize = (int)serviceList.getPages();
        List<Supplier> list = serviceList.getRecords();

        return EasyUIUtil.result(start,pageSize,total,list);
    }

    @GetMapping("/getById")
    public ResultUtil getById(@RequestParam("id") String id){
        Supplier supplier = supplierService.getById(id);
        return ResultUtil.result(200, supplier);
    }

    @GetMapping("/getNewNum")
    public ResultUtil getNewNum(){
        QueryWrapper<Supplier> queryWrapper = new QueryWrapper<>();
        queryWrapper.inSql("num", "select max(num) from supplier");
        Supplier one = supplierService.getOne(queryWrapper);
        return ResultUtil.result(200, one.getNum() + 1);
    }

    @PostMapping("/upset")
    public ResultUtil upset(Supplier supplier){
        int i;
        if (supplier.getId() != null && !"".equals(supplier.getId())){
            supplierService.updateById(supplier);
            i = 2;
        }else {
            supplier.setId(StringUtils.getUUID());
            supplierService.save(supplier);
            i = 3;
        }
        if(i == 2 || i == 3){
            return ResultUtil.result(200,i);
        }else{
            return ResultUtil.result(500);
        }
    }

    @GetMapping("/deleteById")
    public ResultUtil deleteById(@RequestParam("id") String id){
        supplierService.removeById(id);
        return ResultUtil.result(200);
    }

    @GetMapping("/deleteBatch")
    @Transactional
    public ResultUtil deleteBatch(@RequestParam("ids")String ids){
        String[] split = ids.split(",");
        List<String> list = Arrays.asList(split);
        supplierService.removeByIds(list);

        return ResultUtil.result(200);
    }

    @GetMapping("getSupplierList")
    public List<Supplier> getSupplierList(){
        List<Supplier> list = supplierService.list();
        return list;
    }
}
