package org.automation;

public class FifthDay {

     //method overloading	
	void student(int a) {
		System.out.println("Student 1 ID is "+a);
	}
    void student(String s, int a) {
		System.out.println("Student 1 Name is "+s+" and age is "+a);
	}
     void student(char g, String d) {
 		System.out.println("Student 1 gender is "+g+" email is "+d);
    }
     public void student(char g, float i) {
  		System.out.println("Student 1 gender is "+g+" height is "+i);
     }
     public void student(double i, boolean t) {
   		System.out.println("Student 1 weight is "+i+" is he married : "+t);
      }
     
	public static void main(String[] args) {
		
		FifthDay f = new FifthDay();
		f.student(101);
		f.student("Hari", 23);
		f.student('M', "Hari@gm.com");
		f.student('M', 6.3f);
		f.student(55.5, true);

	}
	

}
