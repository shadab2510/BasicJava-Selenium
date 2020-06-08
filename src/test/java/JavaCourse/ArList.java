package JavaCourse;

import java.util.ArrayList;

public class ArList {

	public static void main(String[] args) {

		ArrayList ar= new ArrayList();
				ar.add("shadab");
				ar.add("IT");
				ar.add(25);
				
				ArrayList ar1= new ArrayList();
				ar.add("mahesh");
				ar.add("cs");
				ar.add(455);
				
				// to know the size of the ArrayList
				
				System.out.println(ar.size());
				
				System.out.println("*****");
				
				//to print all the values of ArrayList
				
				for( int i=0;i<ar.size();i++)
				{
					System.out.println(ar.get(i));
				}
				
				System.out.println("*****");
				
				// to add the second arrayList in first ArrayList
				
				ar.addAll(ar1);
				
				System.out.println(ar.size());
				System.out.println("******");
				
				for( int i=0;i<ar.size();i++)
				{
					System.out.println(ar.get(i));
				}
				
				
				//to get the value of index 5
				System.out.println(ar.get(5));
				
				//to remove the value of index 5
				
				//ar.remove(5);
				System.out.println(ar.get(5));
				
				
				
				
	}
	

}
