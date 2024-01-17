package com.example.storespringboot.service;

import com.example.storespringboot.mapper.OrderMapper;
import com.example.storespringboot.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderMapper orderMapper;


    public void add(Order order) {
        orderMapper.add(order);
    }

    public List<Order> selectAll() {
        return orderMapper.selectAll();
    }

    public void delete(Integer id) {
        orderMapper.delete(id);
    }
}
