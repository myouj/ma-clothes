package com.ma.clothes.pojo.entity;

import java.time.LocalDate;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author myouj
 * @since 2019-04-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class DepotInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private Integer document;

    private String customer;

    private String goodsInfo;

    private String operatorTime;

    private String operator;

    private Double amount;

    private Integer sum;

    private String remark;

    private Boolean inOrOut;


}
