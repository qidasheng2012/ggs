package com.ggs.common.aspect;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.core.io.InputStreamSource;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;

import java.util.HashMap;
import java.util.Map;

@Aspect
@Component
@Order(1)
@Slf4j
public class ControllerLogAspect {

    //创建Pointcut表示式，表示所有controller请求
    @Pointcut("execution(* com.ggs.*.center.web.controller..*(..))")
    private void controllerAspect() {
    }

    @Around(value = "controllerAspect()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        //通过uuid关联请求参数和返回参数
        methodBefore(pjp);
        Object proceed = pjp.proceed();
        methodAfterReturing(proceed);
        return proceed;
    }

    // 请求method前打印内容
    public void methodBefore(JoinPoint joinPoint) {
        // 打印请求内容
        try {
            // 下面两个数组中，参数值和参数名的个数和位置是一一对应的。
            Object[] objs = joinPoint.getArgs();
            String[] argNames = ((MethodSignature) joinPoint.getSignature()).getParameterNames(); // 参数名
            Map<String, Object> paramMap = new HashMap();
            for (int i = 0; i < objs.length; i++) {
                if (!(objs[i] instanceof BindingResult) && !(objs[i] instanceof InputStreamSource)) {
                    paramMap.put(argNames[i], objs[i]);
                }
            }
            if (paramMap.size() > 0) {
                log.info("\n方法:{}\n参数:{}", joinPoint.getSignature(), JSON.toJSONString(paramMap));
            }
        } catch (Exception e) {
            log.error("AOP methodBefore:[{}]", e);
        }
    }

    public void methodAfterReturing(Object o) {
        try {
            if (o != null) {
                log.info("Response内容:{}", JSON.toJSON(o));
            }
        } catch (Exception e) {
            log.error("AOP methodAfterReturing:[{}]", e);
        }
    }
}