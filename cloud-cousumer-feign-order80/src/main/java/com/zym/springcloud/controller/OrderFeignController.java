package com.zym.springcloud.controller;

import com.zym.springcloud.entities.CommonResult;
import com.zym.springcloud.entities.Payment;
import com.zym.springcloud.service.PaymentFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <h4>springcloud_study</h4>
 * <p>web</p>
 *
 * @Author : zhao Yuanming
 * @Date : 2022-07-20 12:10
 * @Version : 1.0
 **/
@RestController
public class OrderFeignController{

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentById(id);
    }
    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeout(){
        return paymentFeignService.paymentFeignTimeout();
    }

}
