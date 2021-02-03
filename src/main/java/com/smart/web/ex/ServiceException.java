package com.smart.web.ex;

import com.smart.web.common.ResponseCode;


public class ServiceException extends BaseException {

    public ServiceException(int status, String msg) {
        super(status, msg);
    }

    public ServiceException(ResponseCode responseCode) {
        super(responseCode);
    }
}
