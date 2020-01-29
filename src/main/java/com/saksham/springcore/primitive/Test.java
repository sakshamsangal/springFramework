package com.saksham.springcore.primitive;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

        // because config.xml is in /springcore/src/main/java path
		// else we have to give path of config.xml starting from com/saksham/.../config.xml
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		Employee emp = (Employee) ctx.getBean("emp");
		System.out.println(emp.getId());
		System.out.println(emp.getName());

	}
}
