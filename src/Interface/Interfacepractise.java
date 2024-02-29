package Interface;

interface Interfacepractise112{
   int ab=20;
   int b=90;
	void display();
	default void dis() {
		
	}
   static void disp() {
	   System.out.println("static");
   }
}

interface intf {
	int bc= 25;
	void show();
	
}
class Interfacepractise1 implements Interfacepractise112{
 public void display() {
	 System.out.println("print a" +ab);
	 System.out.println("abstract  method");
 }
 public void dis() {
	 System.out.println("default method");
 }
}
class Aa extends Interfacepractise1 implements intf, Interfacepractise112{
	
	public void display() {
	
		System.out.println("this is grnad child");
	}
	public void disp() {
		System.out.println("this is child of static interface");
	}
	public void show() {
		System.out.println("the value of bc " +bc);
	}
}
/*
class Interfacepractise{
	public static void main(String args[]) {
		Aa a= new Aa();
		a.dis();
		a.disp();
		a.display();
	   a.show();
	
	
	}
}*/