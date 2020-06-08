
public class SuperB  extends SuperA{
	
	public SuperB()
	{
	
	super("shadab",20);
	}
	
	public SuperB(int i)
	{
		super(10);
	}
	public SuperB(String name,String color,int price)
	{
		super("car","red",20);
	}
	
	public static void main(String[]args)
	{
		
	SuperB obj= new SuperB();
	SuperB obj1= new SuperB(10);
	SuperB obj2= new SuperB("car","red",20);
	
	//SuperA
	//Value of i is 10
	//car red 20


	}
}



