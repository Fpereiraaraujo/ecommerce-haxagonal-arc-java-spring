package com.fernando.ecommerce.application.ports.out;

import com.fernando.ecommerce.framework.adapters.out.entities.CategoryEntity;

import java.util.List;

public interface CategoryPortOut {

    CategoryEntity save(CategoryEntity categoryEntity);

    CategoryEntity findById(Long id);

    List<CategoryEntity> findAll();

    void deleteById(Long id);


}
