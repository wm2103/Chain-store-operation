package com.example.storespringboot.controller;

import com.example.storespringboot.pojo.Result;
import com.example.storespringboot.pojo.User;
import com.example.storespringboot.service.UserService;
import com.example.storespringboot.utils.ThreadLocalUtil;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Result<User> login(@RequestBody User user){
        System.out.println(user);
        User loginUser = userService.findByUsername(user.getUsername());

        if(loginUser==null){
            return Result.error("用户名不存在");
        }

        if(loginUser.getPassword().equals(user.getPassword())){
            System.out.println("登录成功");
            ThreadLocalUtil.set(loginUser);
            return Result.success(loginUser);
        }
        return Result.error("密码错误");
    }

    @GetMapping("/selectAll")
    public Result<List<User>> selectAll(){
        System.out.println("查询所有用户信息");
        return Result.success(userService.selectAll());
    }

    @PostMapping("/add")
    public Result<String> add(@RequestBody User user){
        User addUser = userService.findByUsername(user.getUsername());
        //如果用户名不重复
        if(addUser==null){
            userService.add(user);
            return Result.success("添加成功");
        }
        return Result.error("用户名已存在");
    }

    @DeleteMapping("/delete/{id}")
    public Result<String> delete(@PathVariable Integer id){
        userService.delete(id);
        return Result.success();
    }

    @PutMapping("/update")
    public Result<String> update(@RequestBody User user){
        userService.update(user);
        return Result.success();
    }


}
