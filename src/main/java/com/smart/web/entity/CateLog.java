package com.smart.web.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class CateLog implements Serializable {
    /**
     *
     */
    private String id;

    /**
     * 分类的名称
     */
    private String name;

    /**
     * 排序
     */
    private Integer sort;

    /**
     *
     */
    private Integer isDel;

    /**
     *
     */
    private Integer isVip;

    private static final long serialVersionUID = 1L;
}

