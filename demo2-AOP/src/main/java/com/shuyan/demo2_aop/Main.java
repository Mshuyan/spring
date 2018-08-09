package com.shuyan.demo2_aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("02aop_xml.xml");
        Cal cal = (Cal)ctx.getBean("calImpl");
        int result = cal.div(1, 1);
        System.out.println(result);
    }
}
