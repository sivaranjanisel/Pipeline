package Inheritance;

class A1{
	int a;
	void display() {
		System.out.println("this is parent"  + a);
		
	}
}

class B1 extends A1{
    int ba;
	void show() {
		System.out.println("Child class"  + ba);
	
	}
}

class c1 extends B1{
	int ca;
	void dis() {
		System.out.println("this s grandchild"  +ca);
	}
}


