package com.example.storespringboot.mapper;

import com.example.storespringboot.pojo.Order;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface OrderMapper {
    @Insert("insert into orders(goodsname,goodsvalue,goodsnum,storename,storeid)" +
            " values(#{goodsname},#{goodsvalue},#{goodsnum},#{storename},#{storeid})")
    void add(Order order);

    @Select("select * from orders")
    List<Order> selectAll();

    @Delete("delete from orders where orderid=#{id}")
    void delete(Integer id);
}
