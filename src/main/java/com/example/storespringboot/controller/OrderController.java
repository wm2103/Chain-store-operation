package com.example.storespringboot.controller;

import com.example.storespringboot.pojo.Order;
import com.example.storespringboot.pojo.Result;
import com.example.storespringboot.service.OrderService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/add")
    public Result add(@RequestBody Order order){
        //添加订单
        orderService.add(order);
        return Result.success();
    }

    @GetMapping("/selectAll")
    public Result<List<Order>> selectAll(){
        return Result.success(orderService.selectAll());
    }

    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id){
        System.out.println(id);
        orderService.delete(id);
        return Result.success();
    }
}
