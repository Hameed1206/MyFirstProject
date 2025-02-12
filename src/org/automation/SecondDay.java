package org.automation;
//child class
public class SecondDay {

	public void dayTwo() {
		System.out.println("Class 2 method 1");
	}
	
	public void dayTwo2() {
		System.out.println("Class 2 method 2");

	}
	
	public static void main(String[] args) {
		
		SecondDay day2 = new SecondDay();
		day2.dayTwo();
		day2.dayTwo2();
		
		
		FirstDay day1 = new FirstDay();
		day1.flour();
		day1.masala();
		
	}
}
