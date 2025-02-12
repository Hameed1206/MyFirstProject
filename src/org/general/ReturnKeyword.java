package org.general;

public class ReturnKeyword {

	public String methodOne() {
		String s = "Welcome";
		s.length();
		return s;
	}
	
	public int operation() {
		int a = 12000;
		int b = 8000;
		int c = a-b;
		
		 return c;
	}
	public static void main(String[] args) {
		
		ReturnKeyword ss = new ReturnKeyword();
		
//		String sss = ss.methodOne()+" Home";
//		System.out.println(sss);
//		System.out.println(ss.methodOne());
		
		int d = 12000 + ss.operation();
		System.out.println(d);
		
	}

}


//void  -> Nothing