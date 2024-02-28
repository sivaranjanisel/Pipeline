package StaticMethodExample;

public class StaticPractise {

	public static int a=10;
	int b= 20;
	public static void staticmethod() {
		 int bc=100;
		 int c= a+bc;
		
		System.out.println("the static var:" +c);		
	}
	public void disp() {
		System.out.println("the static var through non static: " +a);
		System.out.println("the non static var: " +b);
	}
}
