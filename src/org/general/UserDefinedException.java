package org.general;

import java.util.Scanner;

public class UserDefinedException extends Exception {
	
	
	
	public UserDefinedException(String message) {
		super(message);
	}
	
	public void TrialOne() throws UserDefinedException {
		
		Scanner ss = new Scanner(System.in);
		int i = ss.nextInt();
		
		if (i==2356) {
			System.out.println("Login Successful, Proceed with transactions");
		}
		else {
			throw new UserDefinedException("Pin is Incorrect, Please check your pin");
		}
	}

	public static void main(String[] args) {
		UserDefinedException u = new UserDefinedException("Pin is Incorrect, Please check your pin");
		try {
			u.TrialOne();
		} catch (UserDefinedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getClass());
			System.out.println(e.getLocalizedMessage());
		}
		System.out.println("Final Line");

	}

}
