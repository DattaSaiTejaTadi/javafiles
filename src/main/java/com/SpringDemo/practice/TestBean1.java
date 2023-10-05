package com.SpringDemo.practice;
import org.springframework.context.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean1 {
	public static void main(String args[]) {
		//ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		Bean1 emp1=context.getBean("bean1",Bean1.class);
		Bean1 emp2=context.getBean("bean2",Bean1.class);
		Bean1 emp3=context.getBean("bean3",Bean1.class);
		Bean1 emp4=context.getBean("bean4",Bean1.class);
		Bean1 emp5=context.getBean("bean5",Bean1.class);
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		System.out.println(emp4);
		System.out.println(emp5);
	}

}
