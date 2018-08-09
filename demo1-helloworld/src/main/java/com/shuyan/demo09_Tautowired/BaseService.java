package com.shuyan.demo09_Tautowired;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseService<T> {

    @Autowired
    private BaseRepository<T> repository;

    public void say() {
        System.out.println(repository);
    }
}
