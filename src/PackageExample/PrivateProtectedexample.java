package PackageExample;

/*Access modifiers
-------------
public - we can access everywhere
protected - we can access  outside of the package but through inheritance
default - only within the package
private - only within the class
*/

class test{
	private String a="private variable";
	protected String abc= "protected variable";
	public String cd= "public variable";
    private void display() {
		 int b=102;
		System.out.println("PRIVATE");
		System.out.println("this is private variable" +a);
    	System.out.println("it is a local variable" +b);
    	System.out.println("it is a protected variable" +abc);
    	System.out.println("it is a public variable" +cd);
	}
    void show() {
    	int b=560;
    	System.out.println("PUBLIC");
    	System.out.println("this is private variable: " +a);
    	System.out.println("it is a local variable: " +b);
    	System.out.println("it is a protected variable" +abc);
    	System.out.println("it is a public variable" +cd);
    }
    protected void pdisplay() {
		int b=1152;
		System.out.println("PROTECTED METHOD");
		System.out.println("this is private variable" +a);
    	System.out.println("it is a local variable" +b);
    	System.out.println("it is a protected variable" +abc);
    	System.out.println("it is a public variable" +cd);
	}
}
public class PrivateProtectedexample {
	public static void main(String args[]){
		 /*test test1 = new test();
		 DefaultExample defaultt= new DefaultExample();
		 defaultt.display();
		 ProtectedExample prot= new ProtectedExample();
		 prot.display();*/
		 PrivateExmple test23= new PrivateExmple();
		 test23.show();
		 
		 /*
		 test1.show();
		 test1.pdisplay(); */
	}
}

