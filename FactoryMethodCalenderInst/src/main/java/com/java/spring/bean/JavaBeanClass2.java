package main.java.com.java.spring.bean;

public class JavaBeanClass2 {

	private int intVar;
	private String strVar;
	
	public int getIntVar() {
		return intVar;
	}
	public void setIntVar(int intVar) {
		this.intVar = intVar;
	}
	public String getStrVar() {
		return strVar;
	}
	public void setStrVar(String strVar) {
		this.strVar = strVar;
	}
	
	@Override
	public String toString() {
		return "JavaBeanClass [intVar=" + intVar + ", strVar=" + strVar + "]";
	}
	
	
	
}
