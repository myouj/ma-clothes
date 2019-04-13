package com.ma.clothes.pojo.ao;

import lombok.Data;

@Data
public class PurchaseAO {

    private Integer num;
    private String goodsInfo;
    private String beginTime;
    private String endTime;

    private Integer page;
    private Integer rows;
}
