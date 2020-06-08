package oopConcept_Part2;

public interface USBank {
	// No main method 
		//We can not create the object means interface are Abstract in nature
		//only method declaration
		//no method body
		//in interface we can declare the variable
		// variables are by default Static in nature
		//Can not change the value of variable
		// No static method are allowed
		
		int minBal=100;
		public void credit();
		public void  debit();
		public void transferMoney();

}
