package com.ma.clothes.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ma.clothes.common.resultutils.EasyUIUtil;
import com.ma.clothes.common.resultutils.ResultUtil;
import com.ma.clothes.common.status.DepotStatus;
import com.ma.clothes.common.status.PurchaseStatus;
import com.ma.clothes.common.tools.MyException;
import com.ma.clothes.common.tools.StringUtils;
import com.ma.clothes.pojo.ao.PurchaseAO;
import com.ma.clothes.pojo.dto.GoodsDTO;
import com.ma.clothes.pojo.entity.Purchase;
import com.ma.clothes.pojo.entity.Supplier;
import com.ma.clothes.service.IPurchaseService;
import com.ma.clothes.service.ISupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author myouj
 * @since 2019-04-13
 */
@RestController
@RequestMapping("//purchase")
public class PurchaseController{

    @Autowired
    private IPurchaseService purchaseService;

    @Autowired
    private ISupplierService supplierService;

    @GetMapping("/getNewNum")
    public ResultUtil getNewNum() {
        QueryWrapper<Purchase> queryWrapper = new QueryWrapper<>();
        queryWrapper.inSql("num", "select max(num) from purchase");
        Purchase one = purchaseService.getOne(queryWrapper);
        return ResultUtil.result(200, one.getNum() + 1);
    }

    @PostMapping("/savePurchase")
    public ResultUtil savePurchase(Purchase purchase) {
        purchase.setId(StringUtils.getUUID());
        purchaseService.save(purchase);
        return ResultUtil.result(200);
    }

    @GetMapping("/getList")
    public EasyUIUtil getList(PurchaseAO purchaseAO) {
        IPage<Purchase> iPage = purchaseService.getList(purchaseAO);
        int total = (int) iPage.getTotal();
        int start = (int) iPage.getCurrent();
        int pageSize = (int) iPage.getPages();
        List<Purchase> list = iPage.getRecords();
        return EasyUIUtil.result(start, pageSize, total, list);
    }

    @GetMapping("/getById")
    public ResultUtil getById(@RequestParam("id") String id) {
        Purchase purchase = purchaseService.getById(id);

        String[] split = purchase.getGoodsInfo().split(";");
        List<GoodsDTO> list = new ArrayList<>();
        for (String s : split) {
            GoodsDTO goodsDTO = new GoodsDTO();
            String[] good = s.split(":");
            goodsDTO.setNum(Integer.valueOf(good[0]));
            goodsDTO.setGoods(good[1]);
            goodsDTO.setCount(Integer.valueOf(good[2]));
            goodsDTO.setPrice(Double.valueOf(good[3]));
            goodsDTO.setUnit(good[4]);
            list.add(goodsDTO);
        }
        Map<String, Object> map = new HashMap<>();
        map.put("all", purchase);
        map.put("goods", list);
        return ResultUtil.result(200, map);
    }

    @GetMapping("/checkPurchase")
    public ResultUtil checkPurchase(@RequestParam("id") String id,
                                    @RequestParam("operator")String operator) {
        try {
            Purchase purchase = purchaseService.getById(id);
            purchase.setOperator(purchase.getOperator()+","+operator);
            purchase.setStatus((byte)1);
            purchaseService.updateById(purchase);

        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtil.result(500);
        }
        return ResultUtil.result(200);
    }

    @GetMapping("/depotPurchase")
    public ResultUtil depotPurchase(@RequestParam("id") String id,
                                    @RequestParam("operator")String operator){
        int i = DepotStatus.DEPOT_ERROR;
        String message;
        try {
            i = purchaseService.depotPurchase(id, operator);
        }catch (MyException e){
            e.printStackTrace();
            message = e.getMessage();
            return ResultUtil.result(500, message);
        }catch (Exception e){
            e.printStackTrace();
            return ResultUtil.result(500, "出现异常,入库失败");
        }
        return ResultUtil.result(200, i);
    }

    @GetMapping("/outPurchase")
    public ResultUtil outPurchase(@RequestParam("id") String id,
                                  @RequestParam("operator")String operator,
                                  @RequestParam("status") byte status){
        try{
            purchaseService.outPurchase(id, operator, status);
        }catch (MyException e){
            e.printStackTrace();
            return ResultUtil.result(500, e.getMessage());
        }catch (Exception e){
            e.printStackTrace();
            return ResultUtil.result(500, "出现异常，退货失败");
        }

        return ResultUtil.result(200);
    }

}
