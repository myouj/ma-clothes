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
 * @since 2019-03-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class DepotInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String document;

    private String customer;

    private String goodsInfo;

    private LocalDate operatorTime;

    private String operator;

    private Integer amount;

    private String remark;

    private Boolean inOrOut;


}
