package com.ggs.user.center.model.key;

import com.ggs.common.base.BaseKey;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserKey extends BaseKey {
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