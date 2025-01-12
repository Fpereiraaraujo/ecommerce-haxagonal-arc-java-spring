package com.fernando.ecommerce.framework.repositories;

import com.fernando.ecommerce.framework.adapters.out.entities.ShippingAddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShippingAddressRepository extends JpaRepository<ShippingAddressEntity, Long> {
}
