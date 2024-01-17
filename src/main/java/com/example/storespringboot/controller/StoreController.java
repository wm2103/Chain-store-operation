package com.example.storespringboot.controller;

import com.example.storespringboot.pojo.Result;
import com.example.storespringboot.pojo.Store;
import com.example.storespringboot.service.StoreService;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/store")
public class StoreController {
    @Autowired
    private StoreService storeService;

    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id){
        storeService.delete(id);
        return Result.success();
    }

    @PutMapping("/update")
    public Result update(@RequestBody Store store){
        storeService.update(store);
        return Result.success();
    }

    @GetMapping("/selectAll")
    public Result<List<Store>> selectAll(){
        System.out.println("查询商店信息");
        return Result.success(storeService.selectAll());
    }
    @GetMapping("/selectId")
    public Result<List<Integer>> selectId(){
        return Result.success(storeService.selectId());
    }

    @PostMapping("/add")
    public Result<String> add(@RequestBody Store store){
        storeService.add(store);
        return Result.success();
    }
}
