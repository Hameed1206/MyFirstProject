package org.automation;

public class SixthDay2 extends Sixthday{

	
	public void employee(String s, int i, String l) {
		System.out.println("Employee name is "+s+", ID is "+i+", Laptop model "+l);
	}
	public void newOne() {
		System.out.println("Second");
	}
	
	public static void main(String[] args) {
		
		SixthDay2 d = new SixthDay2();
		d.employee("Swapna", 234, "Dell_IP123");
		d.newOne();
	}
}
