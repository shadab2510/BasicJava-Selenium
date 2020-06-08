package oOPConcept_Part1;

public class GlobalandLocalVariable {
	
	String Name="mahesh";
	int age;
	String branch;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Name="shadab";
		int age=20;
		
		System.out.println(Name);
		
		GlobalandLocalVariable obj= new GlobalandLocalVariable();
		String Namea= obj.Name;
		System.out.println(Namea);
	
		

	}

}
