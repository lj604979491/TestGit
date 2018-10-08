package com.example.demo.dao;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserDao {

    @Select("select * from user")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "desc", column = "desc"),
    })
    public User findUserById(@Param("id") Integer id);


}
