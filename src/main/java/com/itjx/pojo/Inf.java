package com.itjx.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("tb_inf")
public class Inf {
    @TableId(type = IdType.AUTO)
    private Long id;

    private String name;
    private int age;
    private String nation;
    private Date birthday;

    private String education;
    private String speciality;
    private String outlook;


    private String graduation;
    private String postCode;
    private String talent;
    private String userName;

    private String urlImage;


}
