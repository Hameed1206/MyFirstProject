package org.general;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetOne {

	public static void main(String[] args) {
		
		Set<String> s = new LinkedHashSet();
		s.add("Ha");
		s.add("Aa");
		s.add("Sa");
		s.add("Qa");
		s.add("Qa");
		System.out.println(s);
		System.out.println(s.size());
		
		s.remove("Sa");
		
		System.out.println(s);
		
		System.out.println(s.contains("Sa"));
		
		Set<String> ss = new HashSet();
		ss.add("Wa");
		
        ss.addAll(s);
        System.out.println(ss);
        
        ss.removeAll(s);
        
        ss.retainAll(s);
        System.out.println(ss);
        
        
        // To print one by one
        for (String string : s) {
			System.out.println(string);
		}
	}

}
