package com.ggs.common.base;

import com.ggs.common.utils.result.ResultCodeEnum;
import com.ggs.common.utils.result.ResultEntity;
import com.ggs.common.utils.result.ResultEntityUtil;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;

@DefaultProperties(defaultFallback = "defaultFail")
public abstract class BaseController {

    public ResultEntity defaultFail() {
        return ResultEntityUtil.error(ResultCodeEnum.FEIGN_ERROR);
    }
}
