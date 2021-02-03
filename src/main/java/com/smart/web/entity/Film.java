package com.smart.web.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class Film implements Serializable {
    /**
     *
     */
    private String id;

    /**
     *
     */
    private String actor;

    /**
     *
     */
    private String cateLogName;

    /**
     *
     */
    private String cateLogId;

    /**
     *
     */
    private Double evaluation;

    /**
     *
     */
    private String image;

    /**
     *
     */
    private String locName;

    /**
     *
     */
    private String locId;

    /**
     *
     */
    private String name;

    /**
     *
     */
    private String decade;

    /**
     *
     */
    private String plot;

    /**
     *
     */
    private String resolution;

    /**
     *
     */
    private String status;

    /**
     *
     */
    private String subClassName;
    /**
     *
     */
    private String subClassId;

    /**
     *
     */
    private String typeName;

    /**
     *
     */
    private String typeId;

    /**
     *
     */
    private String updateTime;

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

