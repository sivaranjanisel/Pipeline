package Inheritance;

class A{
	int a;
	void display() {
		System.out.println("this is parent"  + a);
		
	}
}

class B extends A{
	protected int ba;
	void show() {
		System.out.println("Child class"  + ba);
	
	}
}
