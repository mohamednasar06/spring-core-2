package com.tyss.springcorexml2;

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
       ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
     User u=(User)  context.getBean("bysetter");
     System.out.println(u.getName());
       
    }
}
