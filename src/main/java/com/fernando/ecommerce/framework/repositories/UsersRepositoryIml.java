package com.fernando.ecommerce.framework.repositories;

import com.fernando.ecommerce.application.ports.out.UsersPortOut;
import com.fernando.ecommerce.framework.adapters.out.entities.UsersEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class UsersRepositoryIml implements UsersPortOut {
    @Override
    public UsersEntity save(UsersEntity usersEntities) {
        return null;
    }

    @Override
    public List<UsersEntity> findAll() {
        return List.of();
    }

    @Override
    public UsersEntity findById(Long id) {
        return null;
    }
}
