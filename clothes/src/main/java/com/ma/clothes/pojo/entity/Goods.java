package com.ma.clothes.pojo.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author myouj
 * @since 2019-04-01
 */
@Data
@ToString
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Goods implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private Integer number;

    private String name;

    private Double price;

    private String unit;

    private String remark;


}
