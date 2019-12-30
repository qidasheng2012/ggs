package com.ggs.user.center.model.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserVo implements Serializable {
    /**
     * 主键id
     */
    private Integer id;
    /**
     * 用户name
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

}