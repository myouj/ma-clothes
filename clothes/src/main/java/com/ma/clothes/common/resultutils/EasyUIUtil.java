package com.ma.clothes.common.resultutils;

import lombok.Data;

import java.util.List;

/**
 * easyui datagrid 分页返回格式
 */
@Data
public class EasyUIUtil {

    private int start;
    private int pageSize;
    private int total;
    private List rows;

    public EasyUIUtil(int start, int pageSize, int total, List rows) {
        this.start = start;
        this.pageSize = pageSize;
        this.total = total;
        this.rows = rows;
    }

    public static EasyUIUtil result(int start, int pageSize, int total, List rows){
        return new EasyUIUtil(start, pageSize, total, rows);
    }
}
