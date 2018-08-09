package com.shuyan;

import com.shuyan.demo07_annotation.UserController;
import com.shuyan.demo09_Tautowired.UserService;
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
        // 从类路径下查找名为 “01applicationContext.xml” 的spring配置文件，并获取 ApplicationContext 对象
        ApplicationContext ctx = new ClassPathXmlApplicationContext("09Tautowired.xml");

        UserService userService = (UserService) ctx.getBean("userService");
        userService.say();
    }
}
