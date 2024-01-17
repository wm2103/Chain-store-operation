package com.example.storespringboot.mapper;

import com.example.storespringboot.pojo.Worker;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface WorkerMapper {
    @Insert("insert into worker(workerid,name,age,gender,phone,storeid) " +
            "values(#{workerid},#{name},#{age},#{gender},#{phone},#{storeid})")
    void add(Worker worker);

    @Delete("delete from worker where workerid=#{workerid}")
    void delete(Worker worker);

    @Update("update worker set name=#{name},age=#{age},gender=#{gender}," +
            "phone=#{phone},storeid=#{storeid} where workerid=#{workerid}")
    void update(Worker worker);

    @Select("select * from worker")
    List<Worker> selectAll();


}
