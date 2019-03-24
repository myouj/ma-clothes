package com.ma.clothes.pojo.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;


/**
 * <p>
 * 
 * </p>
 *
 * @author myouj
 * @since 2019-03-24
 */
@Data
@ToString
public class Manager implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String username;

    private String password;

    private String name;

    private String telephone;

    private String departmentId;

    private Boolean superRoot;


}
