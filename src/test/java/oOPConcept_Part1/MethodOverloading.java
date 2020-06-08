package oOPConcept_Part1;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj= new MethodOverloading();
		obj.method1();
		obj.method1(15);
		obj.method1(10,78);
		
// We can create main method overloading
	}
	
	public static void main( int i)
	{
		
	}
	
	public static void main( int i,int j)
	{
		
	}
	// you can not create method under method
	// same method name or same input param are not allowed
	//method overloading- when two or more method with same name with diferrent param or argument
	public void method1()
	{
		System.out.println("method1..zero param");
	}
	
	public void method1(int i)
	{     System.out.println("value of i is"+" "+i);
		System.out.println("method1..1 param");
	}
	public void method1(int i,int j)
	{
		System.out.println("method1..2 param");
		System.out.println("value of i is"+" "+i+','+" "+" "+"value of j is" + " "+j );
		System.out.println(i+j);
	}
}
