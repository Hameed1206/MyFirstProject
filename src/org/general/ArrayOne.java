package org.general;

public class ArrayOne {

	public static void main(String[] args) {
		
		
		 int [] a = {1, 2, 4, 5, 5};
		 String[] s = {"aa","bb","cc"};
		 
		// System.out.println("Length of array is "+s.length);
		 for (String q : s) {
			//System.out.println(q);
		}
		 
		 //length - count no of values
		 // index = position it starts from zero                  length-1
		 
//		 for (int i = 0; i <= a.length-1; i++) {
//			 
//			System.out.println(a[i]);
//		}
		 
//		 for (int i : a) {                    
//			 
//			System.out.println(i);
//		}
//	   
		// i=0     a[0] = 
		 
		 int[] b = new int[100];

          for (int i = 0; i < b.length; i++) {
			
        	    b[i] = i+1;   // b[0] = 0;
        	    System.out.println(b[i]);
		}
		
		
		 
		 String[] c = {"10","chinni","chandra"};
		 char[] n = {'A','r','!'};
		 
		
    
	}

}
