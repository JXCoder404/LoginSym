package com.itjx.controller;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.itjx.mapper.InfMapper;
import com.itjx.pojo.Inf;
import com.itjx.pojo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfController {
    @Autowired
    InfMapper infMapper;

    @RequestMapping("/getInfByUserName")
    public Result getInfByUserName(String userName){
        QueryWrapper<Inf> wrapper = new QueryWrapper<>();
        wrapper.eq("user_name",userName);
        Inf inf = infMapper.selectOne(wrapper);
        System.out.println(inf);
        return Result.success(inf);
    }
}
