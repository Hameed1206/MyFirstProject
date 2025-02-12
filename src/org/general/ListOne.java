package org.general;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListOne {

	public static void main(String[] args) {
		
		//List is a Interface
		
		List<String> l = new LinkedList();
		
		l.add("hh"); //0
		l.add("ff"); //1
		l.add("gg"); //2
		l.add("hh");
		l.add("ff");
		l.add("hh");
		l.add("hh");
		
		for (int i = 0; i<l.size(); i++) {
			System.out.println(l.get(i));
		}
		//System.out.println(l);
		
		List<String> ll = new LinkedList();
		ll.addAll(l);
		//ll.add("hh");
//		ll.add("gg");
//		ll.add("qq");
//		System.out.println(l.size());
//		System.out.println(ll);
//		
//		ll.retainAll(l);  // will retain only common values
//		
//		System.out.println(ll);
		
//		ll.removeAll(l);   remove the common value
//		
//		System.out.println(ll);
		
		
		
		
		
		
		
		
		
		
		
//		l.set(2, "bb");
//		System.out.println(l);
//		
//		//System.out.println(l.indexOf("ff"));
//		System.out.println(l.lastIndexOf("hh"));
		
//		l.clear();
//		System.out.println(l);
		
//		boolean contains = l.contains("bb");
//		System.out.println(contains);
		
//		l.add(1, "tt");
//		System.out.println(l);
		
//		l.remove(2);
//		System.out.println(l);
//		

	}

}
