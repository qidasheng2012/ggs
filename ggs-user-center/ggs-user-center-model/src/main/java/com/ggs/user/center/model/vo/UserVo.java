package com.ggs.user.center.model.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author
 */
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
     * 状态0无效，1有效，9删除
     */
    private Integer state;

}