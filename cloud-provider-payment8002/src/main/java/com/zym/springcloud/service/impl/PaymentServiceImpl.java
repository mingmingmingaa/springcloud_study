package com.zym.springcloud.service.impl;

import com.zym.springcloud.dao.PaymentDao;
import com.zym.springcloud.entities.Payment;
import com.zym.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <h4>springcloud_study</h4>
 * <p>服务实现类</p>
 *
 * @Author : zhao Yuanming
 * @Date : 2022-07-09 17:25
 * @Version : 1.0
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    //@Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
