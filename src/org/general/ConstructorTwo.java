package org.general;

public class ConstructorTwo extends ConstructorThree{

	String s;
	int i;
	ConstructorTwo(){
		this("My name is Hari");
		System.out.println("Default from Two");
	}
	
	ConstructorTwo(String s){
	this(25);
	System.out.println(s);
	}
	
	ConstructorTwo(int i){
		super("Hello");
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		
		ConstructorTwo a = new ConstructorTwo();
		
		
		
	}
}
