package com.shuyan;

import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Properties;

@Data
public class Person {
    private String name;
    private int age;
    private Car car;
    private List<Car> carList;
    private Map<String,Car> carMap;
    private Properties properties;
}
