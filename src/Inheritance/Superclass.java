package Inheritance;

class Superclass {

  String name = "parent class";
 void superparent() {
	 System.out.println("this is parent super class");
 }
}

class dad extends Superclass{
	String name = "dad";
	void superparent() {
		System.out.println("this is dad");
	}
}

class child extends dad{
	
	String name= "child class";
    
	void superparent() {
		System.out.println("this is not supr var" +name);
		System.out.println("this is super var" +super.name);
		System.out.println("not used supr child class method");
		
		super.superparent();
	}
	
}