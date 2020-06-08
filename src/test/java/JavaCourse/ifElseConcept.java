package JavaCourse;

public class ifElseConcept {

	public static void main(String[] args) {
		
		int a=100;
		int b=200;
		
		if(a>b)
		{
			System.out.println("a is greater than b");
		}
		else
		{
			System.out.println("b is greater than a");	
		}
		
		if(a==b)
		{ System.out.println("a is equal to b");
			
		}
		else
		{
			System.out.println("a is not equeal to b");
		}
		
		
		//Nested if
		
		// to get the highest values in the given variable
		
		int x=400;
		int y=600;
		int z=900;
		
		if(x>y & x>z) //false & false , false & true will be false
		{
			System.out.println("x is highest value");
			
		}
		
		else if (y>z & y>x)
		{
			System.out.println("y is highest value");
		}
		else
		{
			System.out.println("z is highest value");	
		}
	}

}
