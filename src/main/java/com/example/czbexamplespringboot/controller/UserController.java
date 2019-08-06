package com.example.czbexamplespringboot.controller;

import com.example.czbexamplespringboot.dao.UserDao;
import com.example.czbexamplespringboot.entity.User;
import com.example.czbexamplespringboot.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Api(value = "test")
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserDao userDao;
    @Autowired
    UserService userService;

    /**
     * 查询ListUser
     *
     * @return
     */
    @ApiOperation("查询ListUser")
    @PostMapping("/findUser")
    public List<User> findUser() {
        return userDao.findAll();
    }

    /**
     * 增加User
     *
     * @param age
     * @param name
     * @return
     */
    @ApiOperation("增加User")
    @PostMapping("/addUser")
    public User addUser(@ApiParam("年龄") @RequestParam("age") String age,
                        @ApiParam("姓名") @RequestParam("name") String name) {
        User user = new User();
        user.setAge(age);
        user.setName(name);
        return userDao.save(user);
    }

    /**
     * 修改User
     *
     * @param id
     * @param name
     * @param age
     * @return
     */
    @ApiOperation("修改User")
    @PostMapping("/updateUser")
    public User updateUser(@RequestParam("id") Long id,
                           @RequestParam("name") String name,
                           @RequestParam("age") String age) {
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setAge(age);
        return userDao.save(user);
    }

    /**
     * 根据id查询User
     * @param id
     * @return
     */
    @ApiOperation("根据id查询User")
    @PostMapping("/findUserById")
    public Optional<User> findUserById(@RequestParam("id") Long id) {
        Optional<User> user = userDao.findById(id);
        return user;
    }

    /**
     * 根据id删除User
     * @param id
     */
    @ApiOperation("根据id查询User")
    @PostMapping("/deleteUserById")
    public void deleteUserById(@RequestParam("id") Long id) {
        userDao.deleteById(id);
    }

    /**
     * 根据age查询ListUser
     * @param age
     * @return
     */
    @ApiOperation("根据age查询ListUser")
    @PostMapping("/findUserByAge")
    public List<User> findUserByAge (@RequestParam("age") String age){
        return userService.findUserByAge(age);
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

}

