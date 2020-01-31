package com.saksham.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/saksham/springcore/set/config.xml");
		CarDealer carDealer = (CarDealer) applicationContext.getBean("carDealer");
		System.out.println(carDealer.getName());
		System.out.println(carDealer.getModels());
	}

}
