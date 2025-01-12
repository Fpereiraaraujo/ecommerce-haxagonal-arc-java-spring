package com.fernando.ecommerce.framework.repositories;

import com.fernando.ecommerce.framework.adapters.out.entities.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<PaymentEntity, Long> {
}
