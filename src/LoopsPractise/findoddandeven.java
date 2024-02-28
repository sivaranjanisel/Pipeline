package LoopsPractise;

import java.util.*;

public class findoddandeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rev();
	}
	public static void rev() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
    	int r=0;
    	int even=0;
    	int odd =0;
    	while(n>0){
    		r= n%10;		
    		if(r%2==0) {
    			even= even+1;
    			
       		}
    		else {
    			odd = odd+1;
    			
    		}
           n=n/10;
    	} 	
    	System.out.println("even:" +even);
    	System.out.println("odd:" +odd);
    	
    }
}
