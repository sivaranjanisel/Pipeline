package OverloadingConcept;

public class PolymorphismConcept {
  
	public void display() {
		int a=10;
		System.out.println("the unparamterizes method" +a);
	}
	public void display(int a, int b) {
		int c=a+b;
		System.out.println("the sum of c:" +c);
		
	}
	
}
