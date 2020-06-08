package oopConcept_Part2;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Since there are two Start method one in parent class and one in child class with same no of param/argus and
		// we are calling child class method so it overrides the method of parent class and takes child class
		// and it is known as method overriding
		
		//Static polymorphism or compiler polymorphism
		BMW ob= new BMW();
		ob.Start();// overriding method
		ob.Stop();
		ob.kick();
		ob.ignition();
		
		System.out.println("******************************");
		
		//Top casting-when child class object and parent class reference variable 
		 Car c1=new BMW();  //dynamic polymorphism or runtime polymorphism
		 c1.Start();
		 c1.Stop();
		 
		 // Down casting - possible through Casting when parent class object refering to child class reference variable
		 //it will give an exception ClassCastException
		
		BMW b1= (BMW)new Car();// putting casting here by writing BMW in brackets in Object side
		
	}

}
