package com.ma.clothes.pojo.ao;

import lombok.Data;

@Data
public class DepotGoodsAO {

    private Integer depotNum;
    private Integer goodsNum;
    private String goodsName;

    private Integer page;
    private Integer rows;

}
