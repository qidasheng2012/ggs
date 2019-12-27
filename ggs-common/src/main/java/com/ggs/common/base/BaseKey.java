package com.ggs.common.base;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public abstract class BaseKey implements Serializable {

    protected Integer pageNo = 0;

    protected Integer pageSize = 10;

    protected String sortField;

    protected String direction;

    protected Boolean isDefaultSort = true;
}
