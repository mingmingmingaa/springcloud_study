package com.zym.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * <h4>springcloud_study</h4>
 * <p>服务降级类</p>
 *
 * @Author : zhao Yuanming
 * @Date : 2022-07-21 20:01
 * @Version : 1.0
 **/
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK , (┬＿┬)";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut , (┬＿┬)";
    }
}
