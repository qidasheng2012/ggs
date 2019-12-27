package com.ggs.common.utils.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 接口统一返回格式实体类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultEntity<T> implements Serializable {
    private static final long serialVersionUID = 2647550715764328418L;
    /**
     * 状态码
     */
    private int code;
    /**
     * 状态信息
     */
    private String msg;
    /**
     * 返回数据
     */
    private T data;

    public ResultEntity(T data) {
        this.data = data;
    }

}
