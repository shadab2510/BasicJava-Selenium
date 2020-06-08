package JavaCourse;

import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// One dimential array- 
		//Advantages- we can save multiple values in an similar variable- to overcome of this we use collection- arrayList,hashTable
		//Disadvantage- 1-Static in nature/fixed size,  2- Stores similar data types- to overcome of this we use Object
		System.out.println(".....................................1D array.............................................");
		
		
		//1-int array
		
		
		// to store similar data type values in an array variable
		// lowest bound/index=0
		// highest bount/index= n-1, where n is size/length of array

		int i[] = new int[5];
		i[0] = 2;
		i[1] = 4;
		i[2] = 6;
		i[3] = 8;
		i[4] = 10;

		// to print the value at index 3;

		System.out.println(i[3]);

		// to print the value at index that does not exists

		try {
			    System.out.println(i[6]);// it will print arrayIndexoutofBound
		    }

		catch (ArrayIndexOutOfBoundsException e) 
		{

			System.out.println("ArrayIndexOutOfBoundsException");

		}

		finally {
			// to print the index of value 6;
			System.out.println();

			// to print the size of array
			System.out.println(i.length);

			// to print all the values of array

			for (int j = 0; j < i.length; j++)

			{
				System.out.println(i[j]);
			}

		}
		
		
		
		//2- Double array
		
		double d[]= new double [3] ;
		d[0]=1.23;
		d[1]=2.34;
		d[2]=4.56;
		
		System.out.println(d.length);
		
		//3- char array
		
		char c[]= new char[3];
		c[0]= 'd';
		c[1]= '@';
		c[2]=1;
		
		System.out.println(c.length);
		
		System.out.println(c[2]);
		
		//4 bollean arrray
		
		boolean b[]= new boolean[2];
		b[0]= true;
		b[1]=false;
		
		System.out.println(b.length);
		
		//5 String array
		
		String s[]= new String[4];
		s[0]="shadab";
		s[1]="travel";
		s[2]="mark";
		
		System.out.println(s.length);
		
		//5 Object  array= object array is used different types of data types
		
		Object ob[]= new Object[4];
		ob[0]="shadab";
		ob[1]=25;
		ob[2]='a';
		ob[3]=4.56;
		
		System.out.println(ob.length);
		
		System.out.println(ob[3]);
		
		
		
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
