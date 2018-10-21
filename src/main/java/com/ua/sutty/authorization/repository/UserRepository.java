package com.ua.sutty.authorization.repository;

import com.ua.sutty.authorization.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


public interface UserRepository extends JpaRepository<User, Long> {
    User getUserById(Long id);
}
