package com.requestvalidation.api.repository;

import com.requestvalidation.api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User,Integer> {
    User findByUserId(int id);
}
