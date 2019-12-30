package com.ggs.user.center.facade.api;

import com.ggs.common.utils.result.ResultEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(contextId = "userApi", name = "ggs-user-center/user", path = "/v1")
@RequestMapping(value = "/userApi", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public interface UserApi {

    @GetMapping("/list")
    ResultEntity list();

    @GetMapping("/fallBack")
    String fallBack();
}
