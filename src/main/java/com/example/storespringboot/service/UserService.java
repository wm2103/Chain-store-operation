package com.example.storespringboot.service;

import com.example.storespringboot.mapper.UserMapper;
import com.example.storespringboot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;


    public User findByUsername(String username) {
        return userMapper.findByUsername(username);
    }

    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    public void add(User user) {
        userMapper.add(user);
    }

    public void delete(Integer id) {
        userMapper.delete(id);
    }

    public void update(User user) {
        userMapper.update(user);
    }
}
