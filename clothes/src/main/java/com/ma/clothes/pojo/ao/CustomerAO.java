package com.ma.clothes.pojo.ao;

import lombok.Data;

@Data
public class CustomerAO {

    private String company;
    private String manager;

    private Integer page;
    private Integer rows;
}
