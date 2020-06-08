
public class Constructor {
	
	
	String carName;
	String color;
	int price;
	
	public Constructor(String carName,String color,int price)
	{
	
	this.carName=carName;
	this.color=color;
	this.price=price;
	
	}
	
	public Constructor(int number,String name)
	{
		System.out.println(number+" "+name);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Constructor obj1= new Constructor("Audi","blue",20);
	Constructor obj2= new Constructor("bmw","red",15);
	Constructor obj3= new Constructor("benz","white",30);
	
	Constructor obj4= new Constructor(3295,"roadroller");
	
	
	
		
		
		
		
		

		
		
		
		
		
		
		
	}

}
