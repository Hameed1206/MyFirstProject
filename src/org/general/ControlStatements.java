package org.general;

import java.util.Scanner;

public class ControlStatements {

	public static void main(String[] args) {
		
		// Control statements drive with boolean condition
		Scanner s = new Scanner(System.in);
		
		int age = s.nextInt();
		
		// if will be executed only if condition is passed
		   //false     true       true
		
		if (age>=5 && age<=10) {
			System.out.println("Go to kinder garden");
		}
		else if (age>10 && age<=15) {
			System.out.println("Play chess and carrom");
		}
        else if (age>15 && age<=20) {
			System.out.println("Play Cricket");
		}
        else if (age>20 && age<=25) {
			System.out.println("Play snookers");
		}
		else {
			System.out.println("You're not Eligible");
		}
		
		
		
		

	}

}
