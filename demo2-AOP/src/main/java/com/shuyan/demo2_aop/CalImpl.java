package com.shuyan.demo2_aop;

import org.springframework.stereotype.Component;

@Component
public class CalImpl implements Cal {
    @Override
    public int add(int i, int j) {
        int result = i + j;
        return result;
    }

    @Override
    public int mul(int i, int j) {
        int result = i * j;
        return result;
    }

    @Override
    public int div(int i, int j) {
        return i/j;
    }
}
