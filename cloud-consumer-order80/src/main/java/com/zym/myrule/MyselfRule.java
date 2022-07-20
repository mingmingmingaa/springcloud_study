package com.zym.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <h4>springcloud_study</h4>
 * <p>自定义规则</p>
 *
 * @Author : zhao Yuanming
 * @Date : 2022-07-20 10:45
 * @Version : 1.0
 **/
@Configuration
public class MyselfRule {

    @Bean
    public IRule myRule() {
        return new RandomRule();//定义为随机
    }
}
