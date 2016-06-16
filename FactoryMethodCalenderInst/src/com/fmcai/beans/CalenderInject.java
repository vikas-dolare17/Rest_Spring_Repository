package com.fmcai.beans;

import java.util.Calendar;

public class CalenderInject {

	
	Calendar cal = null;
	
	
	public CalenderInject() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public void showTodaysDate(){
		
		
		
		System.out.println("  **  "+cal.getAvailableLocales().toString()+" **");
		
	}


	public Calendar getCal() {
		return cal;
	}


	public void setCal(Calendar cal) {
		this.cal = cal;
	}


	@Override
	public String toString() {
		return "CalenderInject [cal=" + cal + "]";
	}

	
	
}
