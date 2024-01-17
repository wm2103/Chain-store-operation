package com.example.storespringboot.pojo;

import lombok.Data;

@Data
public class Goods {
    private Integer goodsid;
    private String name;
    private Float value;
    private Integer num;
    private String storename;
    private Integer storeid;
}
