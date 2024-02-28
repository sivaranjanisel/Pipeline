package LoopsPractise;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
	     reverse();
     }

		public static void reverse() {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the number: ");
			int n=sc.nextInt();
			int r=0;
			int rev=0;
			int temp=n;
			while(n>0) {
				r=n%10;
				rev =(rev*10)+r;
				n=n/10;	        
			}
			if(rev==temp) {
				System.out.println("the number is palindrome");
			}else {
			System.out.println("not palindrome");
			}
		}

	}
