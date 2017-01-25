package com.niit.ps.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
       ApplicationContext context=new FileSystemXmlApplicationContext("resource/beans.xml");
       Greetings g=(GreetingImpl)context.getBean("t");
       System.out.println(g.sayGreetings());
    }
}
