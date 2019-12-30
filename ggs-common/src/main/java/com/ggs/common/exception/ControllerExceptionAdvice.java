package com.ggs.common.exception;


import com.ggs.common.utils.result.ResultCodeEnum;
import com.ggs.common.utils.result.ResultEntity;
import com.ggs.common.utils.result.ResultEntityUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常类
 */
@Slf4j
@ControllerAdvice
public class ControllerExceptionAdvice {

    /**
     * 全局异常处理，反正异常返回统一格式的map
     *
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public ResultEntity exceptionHandler(Exception ex) {
        log.error("{}", ex);
        return ResultEntityUtil.error(ResultCodeEnum.SYS_ERROR, ex.getMessage());
    }

}
