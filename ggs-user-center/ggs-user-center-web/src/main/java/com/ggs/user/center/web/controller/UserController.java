package com.ggs.user.center.web.controller;

import com.ggs.common.utils.result.ResultEntity;
import com.ggs.common.utils.result.ResultEntityUtil;
import com.ggs.user.center.provider.entity.User;
import com.ggs.user.center.provider.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/userApi")
public class UserController {

    @Autowired
    private IUserService iUserService;

    @GetMapping("/list")
    public ResultEntity list() {
        List<User> userList = iUserService.list();
        return ResultEntityUtil.success(userList);
    }

    @GetMapping("/fallBack")
    public String fallBack() throws Exception {
        // 模拟异常，看是否走熔断逻辑
        throw new RuntimeException("fallBack error");
    }
}
