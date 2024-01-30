package com.itjx.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.itjx.mapper.UserMapper;
import com.itjx.pojo.Result;
import com.itjx.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping("/register")
    public Result register(String userName,String password){
        QueryWrapper<User> wrapper = new QueryWrapper<User>();
        wrapper.eq("user_name",userName);
        if(userMapper.selectOne(wrapper)!=null){
            return Result.error("failed");
        }

        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);
        userMapper.insert(user);

        return Result.success();
    }
}
