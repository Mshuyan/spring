package com.shuyan.demo07_annotation;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public void execute(){
        System.out.println("UserService...");
    }
}
