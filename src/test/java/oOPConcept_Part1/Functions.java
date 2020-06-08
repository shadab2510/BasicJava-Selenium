package oOPConcept_Part1;

public class Functions {
// main method is void- never retuns a value
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Functions f= new Functions();// one object will be created and f will be reference of this object
		
		f.method1();//after creating the object, the copy of all the non static methods in the class will be given to this object, f will be referring the object
	int fv=f.method2();
	System.out.println(fv);
	
	String fs=f.method3();
	System.out.println(fs);
	
	int fd=f.method4(20, 2);
	System.out.println(fd);
	
	
	}
	
	public void method1() // no inputs parameters no ouput  //return type is void here
	{
		System.out.println("method 1");
	}
	
	public int method2() // no inputs parameters with an output //return type is int
	{
		System.out.println("method2");
		int a=2;
		int b=4;
		int c=a+b;
		
		return c;
	}
	
	public String method3() // no inputs parameters with an output //return type is String
	{
		System.out.println("method3");
		String c="Khushboo";
		return c;
	}
	
	public int method4(int x,int y)// two input parameters with an output  //return type is String
	{
		System.out.println("method4");
		int z= x/y;
		return z;
	}

}
