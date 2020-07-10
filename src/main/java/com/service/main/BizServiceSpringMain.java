package com.service.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.BizService;

public class BizServiceSpringMain {
	
	public static void main(String[] args)  {
		//new ClassPathXmlApplicationContext(); Hey I am creating spring container
		//Creating spring container 
		//context is reference for spring container
		/*<bean id="magicService" class="com.service.BizService">
	      <property name="tname" value="Mr. Mocha"/>
	  </bean>      
	  */
		ApplicationContext context=new ClassPathXmlApplicationContext("biz-service.xml");
		//This is example of down casting of reference
		//Object cannot be downcast or up cast but we can do it for only reference 
		BizService bizService=(BizService)context.getBean("magicService");
		bizService.show();
		bizService=null; //This will not destroy the bean 
		System.out.println(bizService.hashCode());
		
		BizService bizService2=(BizService)context.getBean("magicService");
		bizService2.show();
		System.out.println(bizService2.hashCode());
		if(bizService2==bizService){
			System.out.println("Ahahahah I got it");
		}
	}

}
