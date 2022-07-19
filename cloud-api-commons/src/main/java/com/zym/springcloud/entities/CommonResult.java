package com.zym.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <h4>springcloud_study</h4>
 * <p>统一返回结果</p>
 *
 * @Author : zhao Yuanming
 * @Date : 2022-07-09 17:12
 * @Version : 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> implements Serializable {
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}
