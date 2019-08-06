package com.example.czbexamplespringboot.dao;

import com.example.czbexamplespringboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserDao extends JpaRepository<User, Long> {

    List<User> findByAge(String age);
}