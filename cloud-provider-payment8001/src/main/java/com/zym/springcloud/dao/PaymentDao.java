package com.zym.springcloud.dao;

import com.zym.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

/**
 * <h4>springcloud_study</h4>
 * <p>接口</p>
 *
 * @Author : zhao Yuanming
 * @Date : 2022-07-09 17:16
 * @Version : 1.0
 **/
//@Component       //代替@Repository声明bean
@Mapper
public interface PaymentDao {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
