package com.fmci.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fmcai.beans.CalenderInject;

public class TestCalender {
	
	
	public static void main(String... args){
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/fmci/common/application-context.xml");
		
		
		CalenderInject cl = context.getBean("calenderinjection", CalenderInject.class);
		
		cl.showTodaysDate();
	}

}
