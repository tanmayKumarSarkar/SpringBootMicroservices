package com.example.usermatch.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.usermatch.entity.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByUserId(String userId);
    User findOneByUserIdAndPassword(String userId, String password);

}