package com.ggs.web.controller;

import com.ggs.common.utils.result.ResultEntity;
import com.ggs.user.center.facade.api.UserApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/userApi")
public class UserController {

    @Autowired
    private UserApi userApi;

    @GetMapping("/list")
    public ResultEntity getStr() {
        return userApi.list();
    }

}
