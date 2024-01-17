package com.example.storespringboot.mapper;

import com.example.storespringboot.pojo.Store;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StoreMapper {
    @Select("select * from store")
    List<Store> selectAll();

    @Insert("insert into store(storename,address,ceo,jointime) " +
            "values(#{storename},#{address},#{ceo},now())")
    void add(Store store);

    @Update("update store set storename=#{storename},address=#{address},ceo=#{ceo}" +
            " where storeid=#{storeId}")
    void update(Store store);
    @Delete("delete from store where storeid=#{id}")
    void delete(Integer id);

    @Select("select storeid from store")
    List<Integer> selectId();
}
