package com.example.storespringboot.service;

import com.example.storespringboot.mapper.StoreMapper;
import com.example.storespringboot.pojo.Store;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {
    @Autowired
    private StoreMapper storeMapper;

    public List<Store> selectAll() {
        return storeMapper.selectAll();
    }

    public void add(Store store) {
        storeMapper.add(store);
    }

    public void update(Store store) {
        storeMapper.update(store);
    }

    public void delete(Integer id) {
        storeMapper.delete(id);
    }

    public List<Integer> selectId() {
        return storeMapper.selectId();
    }
}
