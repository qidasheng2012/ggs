package com.ggs.common.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum YesNoEnum {

    NO(0, "否"),
    YES(1, "是");

    private int code;
    private String desc;

}
