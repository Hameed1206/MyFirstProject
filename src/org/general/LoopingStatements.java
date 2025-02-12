package org.general;

public class LoopingStatements {

	public static void main(String[] args) {
		
//		 int a = 10;	
//		 while (a>0) {
//		  System.out.println("Java Selenium");
//		  a--;
//		}
		int a = 3;
		int b = 1;
		
		while (b<=10) {
			int c = a*b;
			System.out.println(a+"*"+b+"="+c);
			b++;
		}
	}

}

