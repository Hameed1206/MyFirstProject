package org.automation;

public class Sixthday {

	public void employee(String s, int i, String l) {
		System.out.println("Employee name is "+s+", ID is "+i+", Laptop model "+l);
	}
	public void newOne() {
		System.out.println("first");
	}
	
	public static void main(String[] args) {
		
		Sixthday ss = new Sixthday();
		ss.employee("Anu", 33, "Dell_IP123");
	}

}
