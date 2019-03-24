package com.ma.clothes.common.resultutils;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * 返回类工具，springboot会自动封装成json格式的数据
 */
@Data
public class ResultUtil {

    private int code;
    private String message;
    private Object data;

    public ResultUtil(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static ResultUtil result(int code, String message, Object data){
        return new ResultUtil(code, message, data);
    }

    public static ResultUtil result(int code, Object data){
        return result(code, "request success", data);
    }

    public static ResultUtil result(String message, Object data){
        return result(200, message, data);
    }

    public static ResultUtil result(int code, String message){
        return result(code, message, null);
    }

    public static ResultUtil result(int code){
        return result(code, "request success", null);
    }
}
