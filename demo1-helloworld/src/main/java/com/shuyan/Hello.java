package com.shuyan;

import lombok.Data;

@Data
public class Hello {
    private String str;

    public void say(){
        System.out.println("hello " + str);
    }
}
