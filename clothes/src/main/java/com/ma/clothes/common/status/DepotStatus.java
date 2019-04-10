package com.ma.clothes.common.status;

public interface DepotStatus {

    //仓库容量超出
    int DEPOT_CAPACITY_OUT = 11;

    //仓库可入货
    int DEPOT_CAN_IN = 12;

    //入货异常
    int DEPOT_ERROR = 13;
}
