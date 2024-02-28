package arraypractise;

import java.util.Scanner;

public class sumofelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  int[] arr=new int[5];
	  int i=0,sum=0;
	  Scanner sc= new Scanner(System.in); 
      System.out.println("Enter number: ");
	  for(i=0;i<arr.length;i++) {
	      arr[i]= sc.nextInt();
	  }
	 
	  for(i=0;i<arr.length;i++)  {
		 sum = sum+arr[i];
	  }
	  System.out.println("the sum of the number: " +sum);
	}
}
