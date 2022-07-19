package com.zym.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <h4>springcloud_study</h4>
 * <p>支付</p>
 *
 * @Author : zhao Yuanming
 * @Date : 2022-07-09 17:07
 * @Version : 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private Long id;
    private String serial;

}
