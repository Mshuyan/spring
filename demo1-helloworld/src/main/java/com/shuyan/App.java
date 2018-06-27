package com.shuyan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // 从类路径下查找名为 “applicationContext.xml” 的spring配置文件，并获取 ApplicationContext 对象
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 通过 ApplicationContext 对象获取 applicationContext.xml 中配置的id为“hello”的bean的class属性配置的类的1个实例
        Hello hello = (Hello)ctx.getBean("hello");
        hello.say();
    }
}
