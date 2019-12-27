package com.ggs.common.utils.result;

/**
 * 结果实体工具类
 */
public class ResultEntityUtil {

    public static ResultEntity success() {
        return success(null);
    }

    public static ResultEntity success(Object data) {
        return success(ResultCodeEnum.SUCCESS, data);
    }

    public static ResultEntity success(ResultCodeEnum code, Object data) {
        return new ResultEntity(code.getCode(), code.getDesc(), data);
    }


    public static ResultEntity error(ResultCodeEnum code) {
        return error(code, null);
    }

    public static ResultEntity error(ResultCodeEnum code, String desc) {
        return new ResultEntity(code.getCode(), desc, null);
    }

    public static ResultEntity error(ResultCodeEnum code, Object data) {
        return new ResultEntity(code.getCode(), code.getDesc(), data);
    }


}
