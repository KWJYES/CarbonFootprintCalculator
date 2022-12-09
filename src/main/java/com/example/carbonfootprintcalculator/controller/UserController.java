package com.example.carbonfootprintcalculator.controller;

import com.example.carbonfootprintcalculator.mapper.UserMapper;
import com.example.carbonfootprintcalculator.entity.Response;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
    @Resource
    UserMapper userMapper;

    @PostMapping("/login")
    public Response logerUser(@RequestBody Response.User user)
    {
        String uname = user.getUname();
        String pwd = user.getPwd();
        if (uname.equals(" ")||pwd.equals(" "))
        {
            return new Response(100,"用户名或者密码不为空","");
        }
        else{
            if (userMapper.login(uname,pwd) != null)
            {
                return new Response(200,"登录成功","");
            }
            else {
                return new Response(500,"密码或者用户名错误","");
            }
        }
    }
    @PostMapping("/register")
    public  Response registerUser(@RequestBody Response.User user)
    {
        String uname = user.getUname();
        String pwd = user.getPwd();
        if (uname.equals(" ")||pwd.equals(" "))
        {
            return new Response(100,"用户名或者密码不为空","");
        }
        else{
           if (userMapper.registerByName(user.getUname()) == null){
               userMapper.register(user);
               return new Response(200,"注册成功","");
           }
           else{
               return new Response(500,"注册失败","用户已存在");
           }
        }

    }


}
