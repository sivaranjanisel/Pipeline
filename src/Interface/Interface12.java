package Interface;

public interface Interface12 {

		   int ab=20;
		   int b=90;
			//void display();
			default void dis() {
				System.out.println("this is default");
			}
		   static void disp() {
			   System.out.println("static");
		   }

}
