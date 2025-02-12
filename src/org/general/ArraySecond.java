package org.general;

public class ArraySecond {

	public static void main(String[] args) {
		
		//two dimensional
		
		int[][] a = new int[2][2];
		
	    a[0][0] = 12;
	    a[0][1] = 22;
	    a[1][0] = 33;
	    a[1][1] = 50;
	    
	   // System.out.println(a.length+" "+a[0].length);
	    
	    
//	    for (int i = 0; i < a.length; i++) {
//	    	
//			for (int j = 0; j < a[0].length; j++) {
//				 System.out.print(a[i][j]+" ");
//			}  System.out.println("");
//		}
	    
//	    for (int[] is : a) {
//	    	for (int is2 : is) {
//	    		System.out.println(is2);
//			}
//		}
	    
	    
	   int[][] b = new int[4][3];
	   
	   int c[][] = new int[1][1];
	   
	   int []d[] = new int[2][2];
	    
	   for (int i = 0; i < b.length; i++) {
		for (int j = 0; j < b[0].length; j++) {
			b[i][j] = i*j;
			System.out.print(b[i][j]+"  ");
		} System.out.println("");
	}
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
