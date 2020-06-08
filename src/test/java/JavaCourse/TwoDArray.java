package JavaCourse;

import java.util.ArrayList;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//how to define 2D array
		String x[][]= new String[3][5]; // where is row  and 5 is column
		
		System.out.println(x.length); //it gives total no of rows
		System.out.println(x[0].length); // it gives total no of column
		
		//how to declare the values 
		
		x[0][0]="Shadab";
		x[0][1]="sadaf";
		x[0][2]="khushboo";
		x[0][3]="chammak";
		x[0][4]="chacha";
		
		x[1][0]="rehman";
		x[1][1]="odisha";
		x[1][2]="shahruk";
		x[1][3]="idrisa";
		x[1][4]="koinka";
		
		x[2][0]="ruliya";
		x[2][1]="zahanba";
		x[2][2]="kukila";
		x[2][3]="uhijak";
		x[2][4]="kubrak";
		
		// to print all the values of x
		
		for (int row=0;row<x.length;row++)
		{
			for (int column=0;column<x[0].length;column++)
			{
				System.out.println(x[row][column]);
			}
		}
		
	
		
		
		
	ArrayList ar= new ArrayList();
	ar.add("shadab");
	ar.add("IT");
	ar.add(455);
	System.out.println(ar.size());
	
	
	for(int tr=0;tr<ar.size();tr++)
	{
		System.out.println(ar.get(tr));
	}
	}

}
