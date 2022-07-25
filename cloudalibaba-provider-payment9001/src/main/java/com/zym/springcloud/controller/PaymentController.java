package com.zym.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * <h4>springcloud_study</h4>
 * <p>控制层</p>
 *
 * @Author : zhao Yuanming
 * @Date : 2022-07-25 19:28
 * @Version : 1.0
 **/
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/nacos/{id}")
    public String getPayment(@PathVariable("id") Long id) {
        return "nacos registry, serverPort: " + serverPort + "\t id" + id;
    }
}