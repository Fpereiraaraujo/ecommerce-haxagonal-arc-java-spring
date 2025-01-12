package com.fernando.ecommerce.framework.repositories;

import com.fernando.ecommerce.application.ports.out.ProductPortOut;
import com.fernando.ecommerce.framework.adapters.out.entities.ProductEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
@RequiredArgsConstructor
@Component
public class ProductRepositoryIml implements ProductPortOut {
    @Override
    public ProductEntity save(ProductEntity productEntity) {
        return null;
    }

    @Override
    public ProductEntity findById(Long id) {
        return null;
    }

    @Override
    public List<ProductEntity> findAll(Long id) {
        return List.of();
    }
}
