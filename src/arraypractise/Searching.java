package arraypractise;

import java.util.Scanner;

public class Searching {

	public static void main(String[] args) {
		  int[] arr=new int[5];
		  int i=0,sum=0;
		  Scanner sc= new Scanner(System.in); 
	      System.out.println("Enter number: ");
		  for(i=0;i<arr.length;i++) {
		      arr[i]= sc.nextInt();
		  }
	      System.out.println("Enter number to search: ");
	      int search = sc.nextInt();
	      int b = arr.length-1;
		  for(i=0;i<arr.length;i++)  {
			 if(search==arr[i]) {
				 sum =1;
				 System.out.println("the number is in a["+i+"]:" +arr[i]);
			 }
			 else {
			    if(i==b && sum !=1) {
					 System.out.println("not found");
					 break;
				 }
				 else {
					 continue;
				 }
			}
		}
	}
}

