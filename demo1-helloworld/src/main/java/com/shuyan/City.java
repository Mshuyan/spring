package com.shuyan;

import lombok.Data;

@Data
public class City {
    private String province;
    private String name;

    public String getCounty1Name(){
        return "changchun";
    }
}
