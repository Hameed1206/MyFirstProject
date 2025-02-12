package org.general;

public class StringClass {

	public static void main(String[] args) {
		//index     0123456  
		String s = "Java Selenium";
		String q = "Python Selenium";
		String a = "Java selenium";
		String d = " New";
		String ss = new String("Java Selenium");
		
		System.out.println(s.equals(ss));
		
		System.out.println(s.charAt(10));
		
		System.out.println("Length of string "+s.length());
		
		System.out.println(s.indexOf('a'));
		System.out.println(s.lastIndexOf('a'));

		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		System.out.println(s.startsWith("Java"));
		System.out.println(s.endsWith("m"));
		
		System.out.println(s.contains(a));
		
		System.out.println(s.equalsIgnoreCase(a));
		System.out.println(d.isEmpty());
		
		
		System.out.println(s.replace('J', 'P'));
		
		System.out.println(s.replace("Java", "Python"));
		
		System.out.println(s);  
		
		System.out.println(s.substring(2));
		System.out.println(s.substring(2, 8));
		
		
		System.out.println(s.concat(d));
		
		String sss = " Java ";
		System.out.println(sss);
		System.out.println(sss.trim());
		
	   String n = " Ja va ";
	   System.out.println(n.replace(" ", ""));
	   
	   System.out.println(s.compareTo(q));
		
	}        

}
