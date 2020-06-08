package oopConcept_Part2;

public class TestBank extends HSBCBank 
{

	public static void main(String[] args) {
		
		//If a class implements any Interface, then it is mandatory to define/override all the method available in interface
		//USBank.minBal;
		System.out.println(USBank.minBal);
		HSBCBank hs= new HSBCBank();
		hs.credit();
		hs.debit();
		hs.CarLoan();
		hs.HomeLoan();
		hs.transferMoney();
		
    USBank us=	new	HSBCBank();
    us.credit();
    us.debit();
    us.transferMoney();
    String s= new String("shadab");
    StringBuffer sb= new StringBuffer("$100");
System.out.println(sb.deleteCharAt(3));
	}

}
