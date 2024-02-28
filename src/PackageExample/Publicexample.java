package PackageExample;
import java.lang.*;

public class Publicexample {

	String s;
	int qt,st;
	
public Publicexample(int qt, int st) {
	s= "constructor used";
   this.qt=qt;
   this.st=st;
	
  }
public void s() {
	System.out.println(qt);
}

 public void test() {
     
	 int pt= qt+st;
	 System.out.println("this is pubic and string:   " +s);
	 System.out.println("this is public and the value is  " +pt);
 }
 public void subt(int a, int b) {
     
	 int test= a-b;;

	 System.out.println("this is public and the sub  value is  " +test);
 }
}
