package com.fernando.ecommerce.application.ports.out;

import com.fernando.ecommerce.framework.adapters.out.entities.ProductEntity;
import com.fernando.ecommerce.framework.adapters.out.entities.ShippingAddressEntity;

import java.util.List;

public interface ProductPortOut {

    ProductEntity save(ProductEntity productEntity);

    ProductEntity findById(Long id);

    List<ProductEntity> findAll(Long id);
}
