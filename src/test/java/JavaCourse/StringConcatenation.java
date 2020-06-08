package JavaCourse;

public class StringConcatenation {

	public static void main(String[] args) {
    
		
		//  "+" is concatenation operator
    int a=100;
    int b=200;
    
    String x="Shadab";
    String y="Khushboo";
    
    System.out.println(a+b);
    System.out.println(x+y);
    
    String c= "100";
    String d= "200";
    System.out.println(c+d);
    
    System.out.println(x+y+a+b);//ShadabKhushboo100200
    System.out.println(y+x+b+a);   //KhushbooShadab200100
    
    System.out.println(x+y+(a+b)); // 300HelloWorld100hello200world
    
    
    

	}

}
