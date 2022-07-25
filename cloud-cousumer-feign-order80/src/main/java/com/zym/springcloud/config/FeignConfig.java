package com.zym.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <h4>springcloud_study</h4>
 * <p>日志配置类</p>
 *
 * @Author : zhao Yuanming
 * @Date : 2022-07-20 12:42
 * @Version : 1.0
 **/
@Configuration
public class FeignConfig {

    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
