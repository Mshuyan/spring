package com.shuyan;

import lombok.Data;

@Data
public class County {
    private String name;
    private City city;
    private Long personNum;
    private Double PI;
    private Boolean flag;

    public void init(){
        System.out.println("init ...");
    }

    public void destroy(){
        System.out.println("destroy ...");
    }
}
