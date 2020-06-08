package oOPConcept_Part1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		
			String x="100";
			
			System.out.println(x+20);
			
			//data conversion string to int
			
			int i=Integer.parseInt(x);
			System.out.println(i+20);
			
			// String to double conversion
			
			String s="34.67";
			System.out.println(s+10);
			
			double h=Double.parseDouble(s);
			System.out.println(h+10);
			
			//String to bollean
			
			String b="true";
			boolean b1=Boolean.parseBoolean(b);
			System.out.println(b1);
			
			// int to String conversion
			
			int in=200;
			
			String ins=String.valueOf(in);
			System.out.println(ins+20);
			
			String r="$100";
			Integer.parseInt(s); // it will give NumberFormatException for r=$100
			
			
			
			
		
			
		
		
			
	
		
	
	
	
	}

}
