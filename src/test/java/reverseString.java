
public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// to reverse the number by creating string with String literal
		String a = "Shadab";
		String b="";
		
		for (int i=a.length()-1;i>=0;i--)
		{
			b=b+a.charAt(i);
			
			
		}

		System.out.println(b);
		
		StringBuffer c= new StringBuffer("khushboo");//string buffer makes to able to edit the string in mant ways
		c.append("Wife");
		System.out.println(c);
		c.delete(2, 4);
		System.out.println(c);
		c.deleteCharAt(3);
		System.out.println(c);
		
		/*
		 * 0k 1h 2u 3s 4h 5b 6o 7o
		 * 
		 * 
		 */
	}
	
}
