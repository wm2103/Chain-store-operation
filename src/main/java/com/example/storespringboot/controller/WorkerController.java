package com.example.storespringboot.controller;

import com.example.storespringboot.pojo.Result;
import com.example.storespringboot.pojo.Worker;
import com.example.storespringboot.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/worker")
public class WorkerController {
    @Autowired
    private WorkerService workerService;

    @PostMapping("/add")
    public Result<String> add(@RequestBody Worker worker){
        workerService.add(worker);
        return Result.success();
    }

    @PostMapping("/delete")
    public Result delete(@RequestBody Worker worker){
        workerService.delete(worker);
        return Result.success();
    }

    @PutMapping("/update")
    public Result update(@RequestBody Worker worker){
        workerService.update(worker);
        return Result.success();
    }

    @GetMapping("/selectAll")
    public Result<List<Worker>> selectAll(){
        return Result.success(workerService.selectAll());
    }
}
