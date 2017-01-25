package com.niit.ps.dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
	       ApplicationContext context=new FileSystemXmlApplicationContext("resource/beans1.xml");
	       Traveller g=(Traveller)context.getBean("travell");
	       System.out.println(g.getTravelDetails());
	}

}
