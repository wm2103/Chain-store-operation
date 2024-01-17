package com.example.storespringboot.mapper;

import com.example.storespringboot.pojo.Goods;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface GoodsMapper {

    @Insert("insert into goods(name,num,value,storeid) " +
            "values(#{name},#{num},#{value},#{storeid})")
    void add(Goods goods);

    @Select("select * from goods")
    List<Goods> selectAll();

    @Update("update goods set name=#{name},value=#{value},num=#{num} where goodsid=#{goodsid}")
    void update(Goods goods);

    @Delete("delete from goods where goodsid=#{goodsid}")
    void delete(Goods goods);

    @Select("select * from goods where name=#{goodsname} and storeid=#{storeid}")
    Goods findByNameStoreid(String goodsname, Integer storeid);
}
