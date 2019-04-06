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
 * @since 2019-04-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class AllocationInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String number;

    private Integer currDepot;

    private Integer toDepot;

    private String goodsInfo;

    private Integer amount;

    private LocalDateTime operatorTime;

    private String operator;

    private String remark;


}
