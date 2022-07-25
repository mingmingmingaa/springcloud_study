package com.zym.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.zym.springcloud.service.PaymentHystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <h4>springcloud_study</h4>
 * <p>控制层</p>
 *
 * @Author : zhao Yuanming
 * @Date : 2022-07-21 17:49
 * @Version : 1.0
 **/
@RestController
@Slf4j
//@DefaultProperties(defaultFallback = "payment_Global_FallbackMethod")  //全局的
public class OrderHystrixController {
    @Resource
    private PaymentHystrixService paymentHystrixService;

    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id) {
        String result = paymentHystrixService.paymentInfo_OK(id);
        log.info("*******result:" + result);
        return result;
    }

    //超时降级演示
//    @HystrixCommand(fallbackMethod = "payment_TimeoutHandler", commandProperties = {@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")})
//超过1.5秒就降级自己
    //@HystrixCommand
    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id) {
        String result = paymentHystrixService.paymentInfo_TimeOut(id);
        log.info("*******result:" + result);
        return result;
    }

    //    public String payment_TimeoutHandler(Integer id) {
//        return "我是消费者80,对方支付系统繁忙请10秒后再试。或自己运行出错，请检查自己。";
//    }
//下面是全局fallback方法
//    public String payment_Global_FallbackMethod() {
//        return "Global异常处理信息，请稍后再试,(┬＿┬)";
//    }
}
