package com.fernando.ecommerce.application.ports.out;

import com.fernando.ecommerce.framework.adapters.out.entities.PaymentEntity;
import com.fernando.ecommerce.framework.adapters.out.entities.ProductEntity;

import java.util.List;

public interface PaymentPortOut {
    PaymentEntity save(PaymentEntity paymentEntity);

    PaymentEntity findById(Long id);

    List<PaymentEntity> findAll(Long id);
}
