package Inheritance;

class A2{
	void d1() {
		System.out.println("hierarach parent");
	}
}

class B2 extends A2{
	void d1() {
		System.out.println("hierarch son");
	}
}

class B3 extends A2{
	void d1() {
		System.out.println("hierarch daughter");
	}
}

