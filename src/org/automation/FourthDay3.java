package org.automation;

public class FourthDay3 extends FourthDay2 {

	public void methodFive() {
       System.out.println("Class three method one");
	}
	
	public void methodSix() {
	       System.out.println("Class three method Two");
		}
	
	
	public static void main(String[] args) {
		
		FourthDay3 h = new FourthDay3();
		
		h.methodOne();
		h.methodTwo();
		h.methodThree();
		h.methodFour();
		h.methodFive();
		h.methodSix();
	}
}



                  
 