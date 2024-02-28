package LoopsPractise;

import java.util.*;
/** reverse the number */

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		
		int abc= reverse(n);
		System.out.println(abc);
		
	}

	public static int reverse(int n) {
		int r=0;
		int rev=0;
		while(n>0) {
			r=n%10;
			rev = (rev*10)+r;
			n=n/10;	        
		}
		return rev;
	}

}
