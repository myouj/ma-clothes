package com.ma.clothes.pojo.entity;

import java.time.LocalDateTime;
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
 * @since 2019-04-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Purchase implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private Integer num;

    private String operateTime;

    private String supplier;

    private String goodsInfo;

    private Double amount;

    private String operator;

    private Byte status;

    private String remark;


}
