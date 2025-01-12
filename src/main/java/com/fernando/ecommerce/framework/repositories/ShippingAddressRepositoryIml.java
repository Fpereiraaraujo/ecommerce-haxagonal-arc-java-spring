package com.fernando.ecommerce.framework.repositories;

import com.fernando.ecommerce.application.ports.out.ShippingAddressPortOut;
import com.fernando.ecommerce.framework.adapters.out.entities.ShippingAddressEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
@RequiredArgsConstructor
@Component
public class ShippingAddressRepositoryIml implements ShippingAddressPortOut {
    @Override
    public ShippingAddressEntity save(ShippingAddressEntity shippingAddressEntity) {
        return null;
    }

    @Override
    public ShippingAddressEntity findById(Long id) {
        return null;
    }

    @Override
    public List<ShippingAddressEntity> findAll(Long id) {
        return List.of();
    }
}
