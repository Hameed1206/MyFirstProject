package org.general;

public class ConstructorThree {

	public ConstructorThree() {
		
		System.out.println("Default from three");
	}
	
	ConstructorThree(String s){
		this();
		System.out.println(s);
	}
}
