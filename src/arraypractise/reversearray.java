package arraypractise;

import java.util.Scanner;

public class reversearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int[] arr=new int[10];
		  int[] b=new int[10];
		  int i,j;
		  for(i=0;i<arr.length;i++) {
			  Scanner sc= new Scanner(System.in); 
		      System.out.println("Enter number: ");
		      arr[i]= sc.nextInt();
		     
		  }
		  j = arr.length-1;
		  for(i=0;i<arr.length;i++) {
			  b[j]= arr[i]; 
		      j--;
		  }
		  System.out.println("\nthe original array is\n");
		  for(i=0;i<arr.length;i++) {
		      System.out.println("arr["+ i +"]:" +arr[i]);
		  }
		  System.out.println("\nthe reverse array is\n");
		  for(i=0;i<arr.length;i++) {
			  System.out.println("b["+ i +"]:" +b[i]);
		   
		  }
		}
	}

