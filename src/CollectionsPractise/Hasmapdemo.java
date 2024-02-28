package CollectionsPractise;

import java.util.HashMap;
import java.util.Map;
/*
Collections
-----------
Collection - To represent group of elements/objects/data into single entity then go for collections.

"Collection" is interface which is available in java.util package..
Arrays
--------
1) Size of array is fixed
2) Heterogenious data not allowed ( multiple data values)
HashMap - a class implemented Map interface
--------------
Data can be stored in the form of key, value pairs.
Key is unique. But we can have duplicate values.
Insertion order not preserved(Index not followed)

*/
public class Hasmapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          HashMap hp = new HashMap();
        Map<Integer,String> hpp = new HashMap<Integer,String>();
          hp.put(true,"test");
          hp.put(12, "nivan");
          hp.put(3,123);
          hp.put(4, true);
          hp.put(5, null);
          hp.put(12, "priya");
          hp.put(2, "siva");
          System.out.println(hp.size());
          System.out.println(hp.get(2));
          System.out.println(hp.keySet());
          
          for(Object x: hp.keySet()) {
        	  System.out.println(x + "  " +hp.get(x));
          }
          hpp.put(1, "test");
          hpp.put(2,"siva");
          hpp.put(3, "true");
          for(Object x: hpp.keySet()) {
        	  System.out.println(x + "  " +hpp.get(x));
          }
	}

}
