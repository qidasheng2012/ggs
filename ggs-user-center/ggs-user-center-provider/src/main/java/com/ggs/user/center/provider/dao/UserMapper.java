package com.ggs.user.center.provider.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ggs.user.center.provider.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}