package main.java.com.java.spring.bean;
// This is bean class 

public class JavaBeanClass {

	private int intVar;
	private String strVar;
	private float floatVar;
	private double doubleVar;
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
	public double getDoubleVar() {
		return doubleVar;
	}
	public void setDoubleVar(double doubleVar) {
		this.doubleVar = doubleVar;
	}
	@Override
	public String toString() {
		return "JavaBeanClass [intVar=" + intVar + ", strVar=" + strVar + "]";
	}
	
	
	
}
