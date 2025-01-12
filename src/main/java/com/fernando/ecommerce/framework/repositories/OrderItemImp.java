package com.fernando.ecommerce.framework.repositories;

import com.fernando.ecommerce.application.ports.out.OrderItemPortOut;
import com.fernando.ecommerce.application.ports.out.OrderPortOurt;
import com.fernando.ecommerce.framework.adapters.out.entities.OrderItemEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
@RequiredArgsConstructor
@Component
public class OrderItemImp implements OrderItemPortOut {
    @Override
    public OrderItemEntity save(OrderItemEntity orderItemEntity) {
        return null;
    }

    @Override
    public OrderItemEntity findById(Long id) {
        return null;
    }

    @Override
    public List<OrderItemEntity> findAll(Long id) {
        return List.of();
    }
}
