package ExceptionHandling;

import java.util.Scanner;

public class TryCatchExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	 
		String ab=null;
	
		try {
		  ab.length();
			System.out.println("the result is" + ab.length());
		}
       catch(ArithmeticException e) {
    	   System.out.println("the error is"+ e.getMessage());
       }
       finally {
    	   System.out.println("the program is successfully end in final method");
       }
		System.out.println("the program is ended ");
    	   
       
	}
	


}
