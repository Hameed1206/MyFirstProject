package org.general;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayFunctions {

	public static void main(String[] args) {
		
		int[] irr = {2, 4, 1, 3, 5, 7, 6};
		
		System.out.println("Before "+ Arrays.toString(irr));
		
		Arrays.sort(irr);
		
		System.out.println("After "+Arrays.toString(irr));
		
		int[] irr2 = new int[irr.length];
        int a = 0;
		for (int i = irr.length-1;  i>=0;  i--) {
			irr2[a] = irr[i];
			a++; 
		}
		System.out.println("Descending "+Arrays.toString(irr2));
	}

}
