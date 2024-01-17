package com.example.storespringboot.service;

import com.example.storespringboot.mapper.GoodsMapper;
import com.example.storespringboot.pojo.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;


    public void add(Goods goods) {
        goodsMapper.add(goods);
    }

    public List<Goods> selectAll() {
        return goodsMapper.selectAll();
    }


    public void delete(Goods goods) {
        goodsMapper.delete(goods);
    }

    public void update(Goods goods) {
        goodsMapper.update(goods);
    }

    public Goods findByNameStoreid(String goodsname, Integer storeid) {
        return goodsMapper.findByNameStoreid(goodsname,storeid);
    }
}
