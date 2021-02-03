package com.smart.web.entity;

import java.io.Serializable;
import lombok.Data;

@Data
public class Decade implements Serializable {
    /**
     *
     */
    private String id;

    /**
     *
     */
    private String name;

    /**
     *
     */
    private Integer sort;

    /**
     *
     */
    private Integer isDel;

    private static final long serialVersionUID = 1L;
}

