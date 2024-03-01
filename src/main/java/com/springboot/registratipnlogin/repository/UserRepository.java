package com.springboot.registratipnlogin.repository;

import com.springboot.registratipnlogin.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByEmail(String email);
}
