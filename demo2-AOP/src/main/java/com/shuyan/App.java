package com.shuyan;

import com.shuyan.demo1_proxy.Cal;
import com.shuyan.demo1_proxy.CalImpl;
import com.shuyan.demo1_proxy.CalProxy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CalProxy calProxy = new CalProxy(new CalImpl());
        Cal loggerProxy = calProxy.getLoggerProxy();
        int result = loggerProxy.add(1, 2);
        System.out.println(result);
    }
}
