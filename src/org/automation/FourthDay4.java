package org.automation;

public class FourthDay4 extends FourthDay{

	public void methodSeven() {
           System.out.println("Class four method one");
	}
	public void methodEight() {
        System.out.println("Class four method Two");
	}
	
	public static void main(String[] args) {
		
		FourthDay4 a = new FourthDay4();
		a.methodOne();
		a.methodTwo();
		a.methodSeven();

		
		
        byte as = -128; 
		short b = 32767;
		int s = 2121212121;        //75%          age
		long d = 9879879879L;      //25%         ph no
		
		float f = 25.5f;          // height/weight
		double w = 25.5;           // big decimal
		
		char c = 'd';
		
		String n = "Java";   // Java+10
		String m = "Selenium";
		
		boolean h = true;
		boolean g = false;
	
		
		int aa = 10;
		int bb = 20;
		
		System.out.println(a);
		System.out.println(f);
		System.out.println(d);
		System.out.println(n+(aa+bb));
		System.out.println(h); 
		
	}

}
