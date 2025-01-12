package com.fernando.ecommerce.application.ports.out;

import com.fernando.ecommerce.framework.adapters.out.entities.UsersEntity;

import java.util.List;

public interface UsersPortOut {

    //salvar entidade
    UsersEntity save(UsersEntity usersEntities);

    List<UsersEntity> findAll();

    UsersEntity findById(Long id);
}
