package com.ma.clothes.pojo.ao;

import lombok.Data;

@Data
public class ManagerAO {

    private String name;
    private String department;

    private Integer page;
    private Integer rows;
}
