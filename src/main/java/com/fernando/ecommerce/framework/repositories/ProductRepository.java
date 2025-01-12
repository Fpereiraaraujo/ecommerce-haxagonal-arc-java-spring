package com.fernando.ecommerce.framework.repositories;

import com.fernando.ecommerce.framework.adapters.out.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity,Long> {
}
