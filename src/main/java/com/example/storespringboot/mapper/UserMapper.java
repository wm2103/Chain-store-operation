package com.example.storespringboot.mapper;

import com.example.storespringboot.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from user where username=#{username}")
    User findByUsername(String username);

    @Select("select * from user")
    List<User> selectAll();

    @Insert("insert into user(username,nickname,phone,role,storeid)"+
            " values(#{username},#{nickname},#{phone},#{role},#{storeid})")
    void add(User user);

    @Delete("delete from user where id=#{id}")
    void delete(Integer id);

    @Update("update user set nickname=#{nickname},phone=#{phone}" +
            " where username=#{username}")
    void update(User user);
}
