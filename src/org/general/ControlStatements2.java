package org.general;

public class ControlStatements2 {

	public static void main(String[] args) {
		
		//Amazon - Prime member - some discount
		int a = 2;  // Amazon prime member
		int aa = 3; // SBI Credit
		int b = 5;  // Non prime member and holding SBI card
		
		
		if (a==2) {
			if (aa==3) {
				System.out.println("Prime member and has SBI Credit card so can avail 10%");
			}
			else {
				System.out.println("Only prime member so can avail 5%");
			}
		}
		else {
			if (b == 5) {
				System.out.println("Holding SBI Credit he can avail 3%");
			}
			else {
				System.out.println("Not eligible for discount");
			}
		}

	}

}
