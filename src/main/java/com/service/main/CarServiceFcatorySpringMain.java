package com.service.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.Car;
import com.service.CarFactoryService;
import com.service.Employee;

public class CarServiceFcatorySpringMain {
	
	public static void main(String[] args)  {
		ApplicationContext context=new ClassPathXmlApplicationContext("car-service-factory.xml");
		//This is example of down casting of reference
		//Object cannot be downcast or up cast but we can do it for only reference 
	/*	Car car=(Car)context.getBean("carta");
		System.out.println(car);
		
		
		Employee cEmployee=(Employee)context.getBean("employee");
		System.out.println(cEmployee);*/
		
		CarFactoryService carFactoryService=(CarFactoryService)context.getBean("carFactoryService");
		System.out.println(carFactoryService);
		System.out.println(carFactoryService);
		System.out.println(carFactoryService.getCar());


	}

}
