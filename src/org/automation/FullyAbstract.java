package org.automation;

public class FullyAbstract implements FullyAbstarction, FirstInterface {

	
	public void test2() {
		System.out.println("First method");
	}

	public void test3() {
        System.out.println("Second method");		
	}
	
	public void test4() {
		
	}
	
	public void test5() {
		
	}
	
	public static void main(String[] args) {
		
		FullyAbstract ff = new FullyAbstract();
		ff.test2();
		ff.test3();
	}

	

}
