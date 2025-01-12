package com.fernando.ecommerce.framework.repositories;

import com.fernando.ecommerce.application.ports.out.CategoryPortOut;
import com.fernando.ecommerce.framework.adapters.out.entities.CategoryEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class CategoryRepositoryImp  implements CategoryPortOut {

    private final CategoryRepository categoryRepository;

    @Override
    public CategoryEntity save(CategoryEntity categoryEntity) {
        return null;
    }

    @Override
    public CategoryEntity findById(Long id) {
        return null;
    }

    @Override
    public List<CategoryEntity> findAll() {
        return List.of();
    }

    @Override
    public void deleteById(Long id) {

    }
}
