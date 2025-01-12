package com.fernando.ecommerce.application.ports.out;

import com.fernando.ecommerce.framework.adapters.out.entities.OrderEntity;
import com.fernando.ecommerce.framework.adapters.out.entities.PaymentEntity;

import java.util.List;

public interface OrderPortOurt {
    OrderEntity save(OrderEntity orderEntity);

    OrderEntity findById(Long id);

    List<OrderEntity> findAll(Long id);
}
