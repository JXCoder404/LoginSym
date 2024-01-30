package com.itjx.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.itjx.mapper.UserMapper;
import com.itjx.pojo.Result;
import com.itjx.pojo.User;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    
    @Autowired
    UserMapper userMapper;

    @RequestMapping("/Login")
    public Result Login(String userName,String password){
        System.out.println(userName+password);
        QueryWrapper<User> wrapper = new QueryWrapper<User>();
        wrapper.eq("user_name",userName);
        wrapper.eq("password",password);

        User user = userMapper.selectOne(wrapper);
        System.out.println(user);
        if(user!=null)return Result.success();
        return Result.error("failed");
    }


}
