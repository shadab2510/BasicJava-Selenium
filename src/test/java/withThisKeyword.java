
public class withThisKeyword {
	
	String carName;
	String color;
	int price;
	
	public withThisKeyword(String carName,String color,int price)
	{
		this.carName=carName;
		this.color=color;
		this.price=price;
		
		System.out.println(carName+" "+color+" "+price);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		withThisKeyword obj1 = new withThisKeyword("BMW", "blue", 20);
		withThisKeyword obj2 = new withThisKeyword("benz", "red", 10);
		withThisKeyword obj3 = new withThisKeyword("toyoto", "green", 40);
		withThisKeyword obj4 = new withThisKeyword("maruti", "white", 15);
		withThisKeyword obj5 = new withThisKeyword("mahindra", "grey", 45);
		withThisKeyword obj6 = new withThisKeyword("suzuki", "black", 23);
		
		
				

	}

}
