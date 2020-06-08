package oopConcept_Part2;

public class HSBCBank implements USBank,BrazilBank // is a relationship
{

	//overriding from USBank
	public void credit() {
		System.out.println("HSBC..credit");
		
	}

	
	public void debit() {
		System.out.println("HSBC..debit");
		
	}

	
	public void transferMoney() {
		System.out.println("HSBC..transferMoney");
		
	}
	
	public void CarLoan()
	{
		System.out.println("HSBC..carLoan");
	}
	
	public void HomeLoan()
	{
		System.out.println("HSBC..carLoan");
	}

//Method Overridiing Method of Brazil Bank

	public void FD()
	{System.out.println("HSBC..FD");
	}



	public void Insurence() {
		System.out.println("HSBC..Insurence");
		
	}


	
	public void MF() {
		System.out.println("HSBC..MF");
		
	}
	
	
	
	

}
