package com.fernando.ecommerce.application.ports.out;

import com.fernando.ecommerce.framework.adapters.out.entities.OrderItemEntity;

import java.util.List;

public interface OrderItemPortOut {
    OrderItemEntity save(OrderItemEntity orderItemEntity);

    OrderItemEntity findById(Long id);

    List<OrderItemEntity> findAll(Long id);
}
