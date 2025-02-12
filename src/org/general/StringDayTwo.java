package org.general;

public class StringDayTwo {

	public static void main(String[] args) {
		
	/*	for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= 5; j++) {
				if (i==j ) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}  }    System.out.println("");	  
		} */
		         // 01234567
		String s = "Java Selenium October Batch";
		
//		for (int i = s.length()-1; i >= 0; i--) {
//			System.out.println(s.charAt(i)); 
//		}
//		Java
//		Selenium
//		October
//		Batch
              String[] split = s.split(" "); 
              
              for (int i = 0; i < split.length; i++) {
				   if (!split[i].equals("Java")) {
					System.out.println(split[i]);
				}  
              }  
              
              
              
              
              
		
		
		
		
		
		
		
		
		
	}

}
