package arraypractise;

import java.util.Scanner;
public class SortingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int[] arr=new int[5];
		
		  int i=0,j=0;
		  Scanner sc= new Scanner(System.in); 
	      System.out.println("Enter number: ");
		  for(i=0;i<arr.length;i++) {
		      arr[i]= sc.nextInt();
		  } 
	
		 int temp=0;
		 for(i=0;i<arr.length;i++)  {
			  for(j=i+1;j<arr.length;j++)  {
				  if(arr[j]<arr[i]) {
					  temp= arr[i];
					  arr[i]=arr[j];
				 	  arr[j]= temp;
				  }
			  } 
		}
		  for(i=0;i<arr.length;i++) {
		      System.out.println("arr["+ i +"]:" +arr[i]);
		  }
		
	}
}

