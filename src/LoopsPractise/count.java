package LoopsPractise;

import java.util.*;
public class count {

/*count of numbers */	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number: ");
        int abc= sc.nextInt();
        
        int sumof= sumofcount(abc);
        System.out.println(sumof);  
	}
	public static int sumofcount(int n) {
		int r=0;
		int sum = 0;
		while(n>0) {
			r= n%10;
			sum = sum +r;
			n= n/10;
			
        }
		return sum;
	}
	

}
