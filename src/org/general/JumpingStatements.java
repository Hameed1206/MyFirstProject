package org.general;

public class JumpingStatements {

	//static variable
	static int d;
		
	//instance variable
	 int b;
	
	public static void one() {
		//local variable
		int c = 0;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		one();
		System.out.println(d);
		
		
		
	}

}
