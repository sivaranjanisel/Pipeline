package CollectionsPractise;

import java.util.ArrayList;
import java.util.List;

/*
2

ArrayList - is class implemeted List interface
-----
1) Heterogenious data - allowed
2) Insertion order- preserved(Index)
3) Duplicate elements -- allowed
4) multiple nulls -- allowed
*/
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList listd = new ArrayList();
		List<Integer> inte= new ArrayList<Integer>();
		
       listd.add(true);
       listd.add(10);
       listd.add("welcome");
       listd.add(10.32);
       listd.add(10f);
       listd.add(null);
       listd.add("siva");
       listd.add(null);
       listd.add(false);
       listd.add("324");
       listd.add(0);
	   int listdd= listd.size();
	   for(Object x: listd) {
	     System.out.println(x);
	   }
	   System.out.println("Inserting new value in the position 1");
	   listd.add(1,null);
	   for(Object x: listd) {
		     System.out.println(x);
		   }
           System.out.println("removing ele");
           listd.remove(2);
           for(Object x: listd) {
  		     System.out.println(x);
  		   }
           System.out.println("searching ");
        
           System.out.println(listd.get(6));
           
	}

	
}
