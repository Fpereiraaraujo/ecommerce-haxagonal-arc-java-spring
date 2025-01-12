package com.fernando.ecommerce.application.ports.out;

import com.fernando.ecommerce.framework.adapters.out.entities.ShippingAddressEntity;

import java.util.List;

public interface ShippingAddressPortOut {
    // método para salvar endereço de entrega
    ShippingAddressEntity save(ShippingAddressEntity shippingAddressEntity);

    ShippingAddressEntity findById(Long id);

    List<ShippingAddressEntity> findAll(Long id);
}
