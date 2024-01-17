package com.example.storespringboot.service;

import com.example.storespringboot.mapper.WorkerMapper;
import com.example.storespringboot.pojo.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerService {
    @Autowired
    private WorkerMapper workerMapper;

    public void add(Worker worker){
        workerMapper.add(worker);
    }

    public void delete(Worker worker){
        workerMapper.delete(worker);
    }

    public void update(Worker worker){
        workerMapper.update(worker);
    }

    public List<Worker> selectAll() {
        return workerMapper.selectAll();
    }

}
