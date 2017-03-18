package com.fmci.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fmcai.beans.CalenderInject;

public class TestCalender {
	
	
	public static void main(String... args){
		
		// Branch 1 Modified this changes
		ApplicationContext contextBranch1 = new ClassPathXmlApplicationContext("com/fmci/common/application-context.xml");
		
		// Modifed code by branch1 
		
		ApplicationContext contextBranch2 = new ClassPathXmlApplicationContext("com/fmci/common/application-context.xml");
		
		CalenderInject branch1VarDeclerarcl = context.getBean("calenderinjection", CalenderInject.class);
		
		CalenderInject clBranch2 = context.getBean("calenderinjection", CalenderInject.class);
		
		cl.showTodaysDate();
	}

}
