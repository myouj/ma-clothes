package com.ma.clothes.pojo.ao;

import lombok.Data;

@Data
public class OrdersAO {

    private String customer;
    private String goodsInfo;
    private String beginTime;
    private String endTime;

    private Integer page;
    private Integer rows;
}
