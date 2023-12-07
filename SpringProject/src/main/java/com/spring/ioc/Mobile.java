package com.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("config loaded");

//		System.out.println("***********airtel********");
//		Airtel airtel=(Airtel)context.getBean("Airtel");
//		airtel.calling();
//		airtel.data();
//
//	
//		Airtel airtel2 =context.getBean("Airtel", Airtel.class);
//		airtel2.calling();
//		airtel2.data();
//
//		Sim sim = context.getBean("Sim", Sim.class);
//		sim.calling();
//		sim.data();

		System.out.println("********vodaphone********");

//		Vodaphone voda = (Vodaphone)context.getBean("Vodaphone");
//		voda.calling();
//		voda.data();

//		Vodaphone voda1 = context.getBean("Vodaphone", Vodaphone.class);
//		voda1.calling();
//		voda1.data();
//		
		Sim sim = context.getBean("Sim", Sim.class);
		sim.calling();
		sim.data();
//		
		
	 

	}

}
