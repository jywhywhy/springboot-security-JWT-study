package com.cos.jwt2.repository;

import com.cos.jwt2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserReposiroty extends JpaRepository<User, Long> {
    public User findByUsername(String username);
}
