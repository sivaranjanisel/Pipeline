package PackageExample;

public class ProtectedExample {
   protected int a= 234;
   protected void display() {
	   System.out.println(a);
	   System.out.println("this is protected");
   }
	public void show() {
		System.out.println("this not protected");
	}
	
}
