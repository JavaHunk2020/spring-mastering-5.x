package com.service.main;

import com.service.BizService;

public class BizServiceMain {
	
	//Spring Container
	//JSP/Servlet 
	//main is also a thread - non daemon
	public static void main(String[] args) {
		//Who is creating instance of BizService????programmer
		BizService bizService=new BizService();
		//Who is setting name inside BizService????programmer
		bizService.setTname("Mocha");
		//Who is calling show method????programmer
		bizService.show();
		
		bizService=null; 
		//GC is a daemon thread
		//this object will be eligible for Garbage Collector //GC
		
	}
}
