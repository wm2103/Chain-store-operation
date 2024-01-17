package com.example.storespringboot.pojo;

import lombok.Data;

@Data
public class Store {
    private Integer storeId;
    private String storename;
    private String address;
    private String ceo;
    private String jointime;

}
