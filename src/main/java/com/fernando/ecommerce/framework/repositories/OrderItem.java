package com.fernando.ecommerce.framework.repositories;

import com.fernando.ecommerce.framework.adapters.out.entities.OrderItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItem extends JpaRepository<OrderItemEntity,Long> {
}
