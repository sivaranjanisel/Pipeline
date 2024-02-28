package OverloadingConcept;

public class ConstructorOverloading {
	int a, b,c;
	
	public ConstructorOverloading(){
		System.out.println("the unparam constructor");
		int a;
		this.a=100;
		System.out.println("the value of unparam is a:" +this.a);
	
	}
	public ConstructorOverloading(int a, int b) {
		this.a=a;
		this.b=b;
		this.c= this.a+this.b;
		System.out.println("the param const:c :"+ this.c);
	}
}
