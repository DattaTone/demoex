package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("com/config/config.xml");
		Student st=ap.getBean("s", Student.class);
		System.out.println(st.getSid());
		System.out.println(st.getSname());
		
//	    Student st=ap.getBean("s", Student.class);
//		System.out.println(st);
//		
//		Student st1=ap.getBean("s", Student.class);
//		System.out.println(st1);
//		
			
	}

}
