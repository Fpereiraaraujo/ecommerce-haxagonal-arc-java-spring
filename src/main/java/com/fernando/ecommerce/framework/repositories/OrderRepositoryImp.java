package com.fernando.ecommerce.framework.repositories;

import com.fernando.ecommerce.application.ports.out.OrderPortOurt;
import com.fernando.ecommerce.framework.adapters.out.entities.OrderEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
@RequiredArgsConstructor
@Component
public class OrderRepositoryImp implements OrderPortOurt {
    @Override
    public OrderEntity save(OrderEntity orderEntity) {
        return null;
    }

    @Override
    public OrderEntity findById(Long id) {
        return null;
    }

    @Override
    public List<OrderEntity> findAll(Long id) {
        return List.of();
    }
}
