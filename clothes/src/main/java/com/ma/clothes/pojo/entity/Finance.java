package com.ma.clothes.pojo.entity;

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
 * @since 2019-04-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Finance implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String properties;

    private String orderId;

    private Boolean inOrOut;

    private Double amount;

    private String time;
}
