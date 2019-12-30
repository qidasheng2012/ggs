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

    public static ResultEntity success(ResultCodeEnum resultCodeEnum, Object data) {
        return new ResultEntity(resultCodeEnum.getCode(), resultCodeEnum.getDesc(), data);
    }

    public static ResultEntity error(ResultCodeEnum resultCodeEnum) {
        return error(resultCodeEnum, resultCodeEnum.getDesc());
    }

    public static ResultEntity error(ResultCodeEnum resultCodeEnum, String desc) {
        return new ResultEntity(resultCodeEnum.getCode(), desc, null);
    }

    public static ResultEntity error(ResultCodeEnum resultCodeEnum, Object data) {
        return new ResultEntity(resultCodeEnum.getCode(), resultCodeEnum.getDesc(), data);
    }


}
