package com.ma.clothes.pojo.dto;

import lombok.Data;

@Data
public class GoodsDTO {

    //商品名
    private String goods;
    //数量
    private Integer count;
    //单位
    private String unit;

    //仓库编号
    private Integer num;
    //价格
    private Double price;

}
