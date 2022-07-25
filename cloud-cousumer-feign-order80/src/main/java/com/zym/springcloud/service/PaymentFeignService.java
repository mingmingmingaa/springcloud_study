package com.zym.springcloud.service;

import com.zym.springcloud.entities.CommonResult;
import com.zym.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * <h4>springcloud_study</h4>
 * <p>接口</p>
 *
 * @Author : zhao Yuanming
 * @Date : 2022-07-20 11:43
 * @Version : 1.0
 **/
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @GetMapping(value = "/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);


    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout();
}
