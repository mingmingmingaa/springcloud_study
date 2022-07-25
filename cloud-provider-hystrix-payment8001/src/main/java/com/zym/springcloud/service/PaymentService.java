package com.zym.springcloud.service;

/**
 * <h4>springcloud_study</h4>
 * <p>服务接口</p>
 *
 * @Author : zhao Yuanming
 * @Date : 2022-07-21 17:13
 * @Version : 1.0
 **/
public interface PaymentService {

    public String paymentInfo_OK(Integer id);
    public String payment_Timeout(Integer id);
    public String paymentCircuitBreaker(Integer id);
}
