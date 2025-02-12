package org.general;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner ss = new Scanner(System.in);
		String day = ss.next();
		
		switch (day) {
		
		case "Monday":  {
		   System.out.println("Idli and Sambar");  
		   break; }
		
		case "Tuesday":   {
			System.out.println("Dosai and Chutney"); 
			break;
		}
		case "Wednesday": {
			  System.out.println("Poori and Channa");	
			  break;
			}
		case "Thursday": {
			  System.out.println("Chappathi and Daal");	
			  break;
			}
		case "Friday": {
			  System.out.println("Upma and Chutney");	
			  break;
			}
		default:
			System.out.println("Breakfast not available");
			
		}

	} }


