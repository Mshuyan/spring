package com.shuyan;

import com.shuyan.dao.user.bean.UserEntity;
import com.shuyan.dao.user.mapper.UserMapper;
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
        ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
        UserMapper userMapper = (UserMapper) ctx.getBean("userMapper");
        UserEntity user = userMapper.getUser("shuyan");
        System.out.println(user);
    }
}
