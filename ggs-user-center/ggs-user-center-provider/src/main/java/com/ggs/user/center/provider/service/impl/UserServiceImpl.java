package com.ggs.user.center.provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ggs.user.center.provider.dao.UserMapper;
import com.ggs.user.center.provider.entity.User;
import com.ggs.user.center.provider.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}