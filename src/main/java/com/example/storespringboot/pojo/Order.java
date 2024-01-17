package com.example.storespringboot.pojo;

import lombok.Data;

@Data
public class Order {
    private Integer orderid;
    private String goodsname;
    private Float goodsvalue;
    private Integer goodsnum;
    private Integer storeid;
    private String storename;
}
