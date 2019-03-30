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
 * @since 2019-03-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class DepotGoods implements Serializable {

    private static final long serialVersionUID = 1L;

    private String depotId;

    private String goodsId;

    private String goodsName;

    private Integer count;

    private String remark;


}
