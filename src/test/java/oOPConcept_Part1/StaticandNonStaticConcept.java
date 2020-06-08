package oOPConcept_Part1;

public class StaticandNonStaticConcept {
	//Global variable- the scope of global variable is across all the functions with some condition
	//and the condition are if the vars are static then call it in static way i.e call it directly or call it by className, 
	// and if it is non static then create an object then call it by object reference 
	  String name="shadab";   // non static global variable
	 static int age=27;     // static global variable

	public static void main(String[] args) {
		
		sum();
		StaticandNonStaticConcept.sum();

		System.out.println(StaticandNonStaticConcept.age);
		
		StaticandNonStaticConcept obj= new StaticandNonStaticConcept();
		obj.test();
		

	}
	
	public void test()   // non static method
	{
		System.out.println("test method");
	}
	
	
	//can i access the static method by object reference;- Yes we can but it will show warning to that you should call it in a static way
	public static void sum()
	{
		System.out.println("sum method");
	}

}
