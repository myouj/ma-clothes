package com.ma.clothes.pojo.ao;

import lombok.Data;

@Data
public class AllocationAO {

    private Integer searchNumber;
    private String searchMaterial;
    private String searchBeginTime;
    private String searchEndTime;

    private Integer page;
    private Integer rows;
}
