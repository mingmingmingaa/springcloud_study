package com.zym.springcloud.service;

import com.zym.springcloud.entities.Payment;

/**
 * <h4>springcloud_study</h4>
 * <p>服务</p>
 *
 * @Author : zhao Yuanming
 * @Date : 2022-07-09 17:24
 * @Version : 1.0
 **/
public interface PaymentService {
    public int create(Payment payment); //写

    public Payment getPaymentById(Long id);  //读取
}
