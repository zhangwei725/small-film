package com.smart.web.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class User implements Serializable {
    /**
     *
     */
    private String id;

    /**
     *
     */
    private Date createDate;

    /**
     *
     */
    private Date expireDate;

    /**
     *
     */
    private String email;

    /**
     *
     */
    private String username;

    /**
     *
     */
    private String password;

    /**
     *
     */
    private Long isVip;

    /**
     * 是否是管理员
     */
    private Integer isManager;

    private static final long serialVersionUID = 1L;
}

