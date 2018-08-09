package com.shuyan.demo1_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CalProxy {

    private Cal target;

    public CalProxy(Cal target) {
        this.target = target;
    }

    public Cal getLoggerProxy(){

        InvocationHandler handler = new InvocationHandler() {

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method.getName() + " start");
                Object result = method.invoke(target, args);
                System.out.println(method.getName() + " end");
                return result;
            }
        };

        return (Cal) Proxy.newProxyInstance(Cal.class.getClassLoader(),new Class[]{Cal.class},handler);
    }
}
