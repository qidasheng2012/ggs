package com.ggs.common.base;

import lombok.Data;

import java.io.Serializable;

@Data
public abstract class BaseKey implements Serializable {

    protected Integer pageNo = 0;

    protected Integer pageSize = 10;

    protected String sortField;

    protected String direction;

    protected Boolean isDefaultSort = true;
}
