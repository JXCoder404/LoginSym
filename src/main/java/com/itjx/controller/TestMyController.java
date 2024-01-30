package com.itjx.controller;


import com.itjx.mapper.UserMapper;
import com.itjx.pojo.Result;
import com.itjx.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class TestMyController {

    @Autowired
    private UserMapper userMapper;


    @RequestMapping("/selectAll")
    public Result selectAll(){
        List<User> userList = userMapper.selectList(null);
        return Result.success(userList);
    }

    @RequestMapping("/insertOne")
    public Result insertOne(User user){
        userMapper.insert(user);
        return Result.success();
    }


}
