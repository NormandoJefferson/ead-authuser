package com.ead.authuser.repositories;

import com.ead.authuser.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<UserModel, UUID> {

    // Query Methods (pois não existem por default no JpaRepository)
    boolean existsByUsername(String username);

    boolean existsByEmail(String email);

}