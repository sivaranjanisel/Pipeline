package CollectionsPractise;

import java.util.HashSet;
/*
Collections
-----------
Collection - To represent group of elements/objects/data into single entity then go for collections.

"Collection" is interface which is available in java.util package..
Arrays
--------
1) Size of array is fixed
2) Heterogenious data not allowed ( multiple data values)
HashSet   - a class implemented Set interface
---------
1) Heterogenios data ---> allowed
2) Insertion order  --> Not preserved (Index not supported)
3) Duplicate elements --> Not Allowed
4) Multiple nulls Not allowed/ only single null is allowed
*/


public class HashsetClassDemo {
	public static void main(String[] args) {
	
		HashSet hs= new HashSet();
		
		hs.add(10);
		hs.add(12);
		hs.add(100);
		hs.add(null);
		hs.add(true);
		hs.add("test");
		hs.add("true");
		hs.add(null);
		hs.add(123);
		System.out.println(hs);
		System.out.println(hs.size());
		hs.remove(100);
		System.out.println(hs);
		for(Object x: hs) {
			System.out.println(x);
		}
		hs.clear();
		System.out.println(hs.size());
		System.out.println(hs);
	}
}
