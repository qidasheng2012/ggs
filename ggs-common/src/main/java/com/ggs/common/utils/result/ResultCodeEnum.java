package com.ggs.common.utils.result;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 平台错误码统一标准
 * <p>
 * /**
 * * 请求响应码
 * 0 成功
 * 1**	请求参数错误
 * 2**	业务逻辑错误
 * 9**	服务器错误，服务器在处理请求的过程中发生了错误
 **/
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum ResultCodeEnum {

    SUCCESS(0, "成功"),
    PARAM_NULL(4001, "参数不能为空"),
    SYS_FAIL(4002, "操作失败"),
    TAG_DUPLICATE(4003, "标签名称重复"),
    ID_NULL(4004, "id不能为空"),
    STATUS_NULL(4005, "status不能为空"),
    ILLEGAL_PARAMS(4006, "非法参数"),
    FEIGN_ERROR(600, "feign调用异常"),
    USER_FEIGN_ERROR(601, "user服务feign调用异常"),
    SYS_ERROR(999, "系统异常");

    private int code;
    private String desc;

    public static ResultCodeEnum fromCode(int code) {
        for (ResultCodeEnum resultCode : ResultCodeEnum.values()) {
            if (resultCode.getCode() == code) {
                return resultCode;
            }
        }
        return null;
    }

    public static String getDescByCode(int code) {
        for (ResultCodeEnum resultCode : ResultCodeEnum.values()) {
            if (resultCode.getCode() == code) {
                return resultCode.getDesc();
            }
        }
        return "";
    }

}
