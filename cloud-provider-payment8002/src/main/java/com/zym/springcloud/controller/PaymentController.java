package com.zym.springcloud.controller;

import com.zym.springcloud.entities.CommonResult;
import com.zym.springcloud.entities.Payment;
import com.zym.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <h4>springcloud_study</h4>
 * <p>web方法</p>
 *
 * @Author : zhao Yuanming
 * @Date : 2022-07-09 17:29
 * @Version : 1.0
 **/
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String port;


    @PostMapping(value = "/payment/create")
    //把payment封装成bean对象
    public CommonResult<Payment> create(@RequestBody Payment payment) { //埋雷
        int result = paymentService.create(payment);
        log.info("*****插入结果：" + result);
        if (result > 0) {  //成功
            return new CommonResult(200, "插入数据库成功", result);
        } else {
            return new CommonResult(444, "插入数据库失败", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        System.out.println("port" + port);
        Payment payment = paymentService.getPaymentById(id);
        log.info("*****查询结果：" + payment);
        if (payment != null) {  //说明有数据，能查询成功
            return new CommonResult(200, "查询成功", payment);
        } else {
            return new CommonResult(444, "没有对应记录，查询ID：" + id, null);
        }
    }

}
