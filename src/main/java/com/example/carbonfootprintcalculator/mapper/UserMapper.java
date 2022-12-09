package com.example.carbonfootprintcalculator.mapper;
import com.example.carbonfootprintcalculator.entity.Response;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


@Mapper
public interface UserMapper {
    //登录
    @Select("select * from t_user where uname = #{uname} and pwd =#{pwd}")
    Response.User login(@Param("uname")String uname, @Param("pwd") String pwd);
    //注册
    @Update("insert into t_user values(default,#{uname},#{pwd})")
    void   register(Response.User user);
    @Select("select * from t_user where uname = #{uname}")
    Response.User registerByName(String name);

}
