package Packageexample2;

import OverloadingConcept.ConstructorOverloading;
import OverloadingConcept.PolymorphismConcept;
import PackageExample.Publicexample;
import StaticMethodExample.StaticPractise;

public class Publicextend {
	Publicexample ex;
	
	public static void main(String[] args) {
	
		Publicexample ex= new Publicexample(10,20);
		ex.test();
		ex.s();
		ex.subt(50,4);
		PolymorphismConcept poly= new PolymorphismConcept();
		poly.display();
		poly.display(20,25);
		ConstructorOverloading c=new ConstructorOverloading();
		ConstructorOverloading cc= new ConstructorOverloading(25,6);
		StaticPractise sc= new StaticPractise();
		sc.disp();
		StaticPractise.staticmethod();
		System.out.println(StaticPractise.a);
		
	}
}
