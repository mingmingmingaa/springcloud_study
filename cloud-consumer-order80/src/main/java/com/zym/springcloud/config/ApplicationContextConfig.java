package com.zym.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * <h4>springcloud_study</h4>
 * <p>配置类</p>
 *
 * @Author : zhao Yuanming
 * @Date : 2022-07-09 18:57
 * @Version : 1.0
 **/
@Configuration
public class ApplicationContextConfig {

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
