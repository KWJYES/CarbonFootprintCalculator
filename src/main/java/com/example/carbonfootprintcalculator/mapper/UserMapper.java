package com.example.carbonfootprintcalculator.mapper;

import com.example.carbonfootprintcalculator.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface UserMapper {

    //登录
    @Select("select * from t_user where uname=#{uname} and pwd=#{pwd}")
    User login(@Param("uname")String uname,@Param("pwd") String pwd);

    //注册
    @Update("insert into t_user values(#{uname},#{pwd})")
    void register(User user);

    //注册时判断用户是否存在
    @Select("select* from t_user where uname=#{name}")
    User  registerByName(String name);


}

