package com.ma.clothes.pojo.entity;

import java.time.LocalDateTime;
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
 * @since 2019-04-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ToString
public class Orders implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private Integer number;

    private String customer;

    private String goodsInfo;

    private String operator;

    private String operateTime;

    private Double amount;

    private Byte status;

    private String remark;


}
