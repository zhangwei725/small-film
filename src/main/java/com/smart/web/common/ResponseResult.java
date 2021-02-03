package com.smart.web.common;

import lombok.Data;

@Data
public class ResponseResult<T> {
    private String msg;
    private int status;
    private T data;

    private ResponseResult(int status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }


    private ResponseResult(ResponseCode respCode) {
        this(respCode, null);
    }

    private ResponseResult(ResponseCode respCode, T data) {
        this(respCode.getStatus(), respCode.getMsg(), data);
    }


    public static <T> ResponseResult<T> success(T data) {
        return success(ResponseCode.SUCCESS, data);
    }

    public static <T> ResponseResult<T> success(ResponseCode respCode, T data) {
        return new ResponseResult<T>(respCode, data);
    }

    public static <T> ResponseResult<T> error() {
        return new ResponseResult<T>(ResponseCode.ERROR);
    }

    public static <T> ResponseResult<T> error(int status, String msg) {
        return new ResponseResult<T>(status, msg, null);
    }


    public static <T> ResponseResult<T> error(ResponseCode respCode) {
        return error(respCode, null);
    }

    public static <T> ResponseResult<T> error(ResponseCode respCode, T data) {
        return new ResponseResult<T>(respCode, data);
    }
}
