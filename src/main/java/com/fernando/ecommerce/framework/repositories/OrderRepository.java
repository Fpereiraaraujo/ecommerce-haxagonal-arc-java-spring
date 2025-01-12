package com.fernando.ecommerce.framework.repositories;

import com.fernando.ecommerce.framework.adapters.out.entities.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderEntity,Long> {
}
