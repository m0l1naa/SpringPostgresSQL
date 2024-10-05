package com.ada.postgresdb.repository;

import com.ada.postgresdb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}