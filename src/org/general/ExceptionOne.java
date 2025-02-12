package org.general;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ExceptionOne {

	static String s;
	public static void main(String[] args) {
		          
		File f = new File("C:\\Users\\91936\\Desktop\\Selenium Automation\\October evng batch\\Day 10 - Understanding things.txt");
		try {
			//FileInputStream ff = new FileInputStream(f);
			String s = "123a";
			System.out.println(s.charAt(5));
			System.out.println(s+2);
			int int1 = Integer.parseInt(s);
			
			System.out.println(int1+2);
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Hello");
		}
		
		//System.out.println("Hello");
//		String s = "123a";
//		
//		System.out.println(s+2);
//		int int1 = Integer.parseInt(s);
//		
//		System.out.println(int1+2);
//		
//		System.out.println("Hello");

		
	}

}
