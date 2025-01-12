package com.fernando.ecommerce.framework.repositories;

import com.fernando.ecommerce.application.ports.out.PaymentPortOut;
import com.fernando.ecommerce.framework.adapters.out.entities.PaymentEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class PaymentRepositoryImp implements PaymentPortOut {

    private final PaymentRepository paymentRepository;

    @Override
    public PaymentEntity save(PaymentEntity paymentEntity) {
        return null;
    }

    @Override
    public PaymentEntity findById(Long id) {
        return null;
    }

    @Override
    public List<PaymentEntity> findAll(Long id) {
        return List.of();
    }
}
