package com.example.storespringboot.controller;

import com.example.storespringboot.pojo.Goods;
import com.example.storespringboot.pojo.Order;
import com.example.storespringboot.pojo.Result;
import com.example.storespringboot.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    //只能通过公司订单添加
    @PostMapping("/add")
    public Result add(@RequestBody Order order){
        System.out.println("通过订单添加商品"+order);
        Goods addGoods=goodsService.findByNameStoreid(order.getGoodsname(),order.getStoreid());
        System.out.println("查询"+addGoods);
        if(addGoods==null){


            //没有该商品
            addGoods=new Goods();
            addGoods.setName(order.getGoodsname());
            addGoods.setNum(order.getGoodsnum());
            addGoods.setValue(order.getGoodsvalue());
            addGoods.setStoreid(order.getStoreid());
            addGoods.setStorename(order.getStorename());
            goodsService.add(addGoods);
            return Result.success();
        }
        System.out.println(addGoods);
        addGoods.setNum(addGoods.getNum()+order.getGoodsnum());
        System.out.println(addGoods);
        goodsService.update(addGoods);
        return Result.success();
    }

    @GetMapping("/selectAll")
    public Result<List<Goods>> selectAll(){
        return Result.success(goodsService.selectAll());
    }

    @PostMapping("/delete")
    public Result<String> delete(@RequestBody Goods goods){
        goodsService.delete(goods);
        return Result.success();
    }

    @PutMapping("/update")
    public Result<String> update(@RequestBody Goods goods){
        goodsService.update(goods);
        return Result.success();
    }

}
