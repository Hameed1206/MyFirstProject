package org.automation;

public class FourthDay2 extends FourthDay{

	public void methodThree() {
	       System.out.println("Class Two Method one");
		}
	public void methodFour() {
	       System.out.println("Class Two Method Two");
		}
	
	public static void main(String[] args) {
	
		FourthDay2 f = new FourthDay2();
		f.methodOne();
		f.methodTwo();
		f.methodThree();
		f.methodFour();
	}
}
