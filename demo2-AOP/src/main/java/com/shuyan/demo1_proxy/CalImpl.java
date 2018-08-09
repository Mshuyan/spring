package com.shuyan.demo1_proxy;

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
}
