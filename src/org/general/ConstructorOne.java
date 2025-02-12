package org.general;

public class ConstructorOne {

	int x;
	int y;
	String z;
	String m;
	
	//default constructor
	public ConstructorOne() {
		System.out.println("Hello World..!!");
		x = 10;
		y = 20;
	}	
	// Parameterized constructor
	public ConstructorOne(int a, int b) {
		System.out.println("Parameterized 1");
		x=a;
		y=b;
	}
	public ConstructorOne(String b , String bb) {
		System.out.println("String constructor");
		m=b;
		z=bb;
	}
	public static void main(String[] args) {
		
		ConstructorOne w = new ConstructorOne();
		ConstructorOne s = new ConstructorOne(100, 200);

		ConstructorOne ss = new ConstructorOne(200, 500);
		System.out.println(ss.x+ss.y);
		
		ConstructorOne q = new ConstructorOne("Hi", "Hello");
		
		System.out.println(q.m + q.z);
	 
		
	}
}
