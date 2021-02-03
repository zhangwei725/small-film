package com.smart.web.ex;

import lombok.Getter;
import lombok.Setter;

/**
 * LoginException
 * 400001  用户名或者密码错误
 */

public class DaoException extends BaseException {
    public DaoException(int status, String msg) {
        super(status, msg);
    }
}
