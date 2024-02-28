package Inheritance;

public class New{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       B bb= new B();
       bb.a=10;
       bb.ba=20;
       bb.display();
       bb.show();
       c1 abc= new c1();
       abc.a=10;
       abc.ba=20;
       abc.ca=30;
       abc.dis();
       abc.display();
       abc.show();
       B2 b= new B2();
       B3 b2= new B3();
       A2 a= new A2();
       a.d1();
       b.d1();
       b2.d1();
       child sp= new child();
       System.out.println(sp.name);
      
      sp.superparent();
	}

}
