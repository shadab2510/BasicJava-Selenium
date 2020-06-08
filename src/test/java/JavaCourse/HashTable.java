package JavaCourse;

import java.util.ArrayList;
import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		
		Hashtable h= new Hashtable();
		h.put("A", "shadab");
		h.put("B", "khushboo");
		h.put("c", "sadaf");
		
		
		
		//to know the size of the hashtable
		
		System.out.println(h.size());
		
		System.out.println("*****");
		
		//to know the value of key c
		
		System.out.println(h.get("c"));
		

// to restrict key and value to Integer only
		
		Hashtable<Integer,Integer> ht = new Hashtable<Integer,Integer>();
		ht.put(1, 455);
		ht.put(2, 456);
		ht.put(3, 457);
		
		// to restrict key and value to Integer and String only
		
		Hashtable<Integer,String> ht1 = new Hashtable<Integer,String>();
		ht1.put(1, "shadab");
		ht1.put(2, "suresh");
		ht1.put(3, "jagesg");
		
		// to restrict key and value to Integer and double only
		
		Hashtable<Integer,Double> ht2 = new Hashtable<Integer,Double>();
		ht2.put(1, 4.66);
		ht2.put(2, 5.55);
		ht2.put(3, 3.55);
		
		System.out.println(ht2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	//Array list and hashtable
	ArrayList ar= new ArrayList();
	
	ar.add("shadab");
	
	Hashtable ht6= new Hashtable();
	ht6.put(1, "shadab");
	ht6.put(2, "khushboo");
	
	System.out.println(ht6);
	

	}

}
