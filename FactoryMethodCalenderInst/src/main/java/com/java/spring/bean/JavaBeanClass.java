package main.java.com.java.spring.bean;
// This is bean class 

public class JavaBeanClass {

	private int intVar;
	private String strVar;
	private float floatVar;
	
	
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
	
	public float getFloatVar() {
		return floatVar;
	}
	public void setFloatVar(float floatVar) {
		this.floatVar = floatVar;
	}
	@Override
	public String toString() {
		return "JavaBeanClass [intVar=" + intVar + ", strVar=" + strVar + "]";
	}
	
	
	
}
