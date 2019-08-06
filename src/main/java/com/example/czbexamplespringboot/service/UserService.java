package com.example.czbexamplespringboot.service;

import com.example.czbexamplespringboot.dao.UserDao;
import com.example.czbexamplespringboot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    /**
     * 根据age查询ListUser
     * @param age
     * @return
     */
    public List<User> findUserByAge(String age){
        return userDao.findByAge(age);
    }
}
