package com.smart.web.common;

import lombok.Getter;

/**
 * 业务错误错误的状态码
 */
@Getter
public enum ResponseCode {
    /**
     * 返回成功
     */
    SUCCESS(200, "success", "成功"),

    ERROR(404, "error", "错误"),
    //    用户相关的状态信息
    USER_NOT_NAME(400010, "error", "用户名不存在"),
    /**
     * 用户被锁定
     */
    USER_IS_LOCKED(400012, "user is  locked", "用户被锁定,请于管理员联系"),
    /**
     *
     */
    USER_PASSWORD_NAME(400011, "password is error", "密码错误");

    /**
     * 返回码
     */
    protected int status;
    /**
     * 返回说明
     */
    protected String msg;
    /**
     * 提示消息
     */
    protected String tips;

    ResponseCode(int retCode, String retMsg, String tips) {
        this.status = retCode;
        this.msg = retMsg;
        this.tips = tips;
    }

}
