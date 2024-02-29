package Inheritance;


import Interface.Interface12;

interface intf {
	int bc= 25;
	void show();
	void display();
}
class Interfacepractise1 implements Interface12{
 public void display() {
	 System.out.println("print a" +ab);
	 System.out.println("abstract  method");
 }
 public void dis() {
	 System.out.println("default method");
 }
}
class Aa extends Interfacepractise1 implements intf, Interface12{
	
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

public class Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Aa abc= new Aa();
          abc.dis();
          abc.disp();
          abc.display();
          abc.show();
          
	}

}
