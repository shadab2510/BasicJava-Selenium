import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList ar= new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add("shadab");
		
		ArrayList<String> ar1= new ArrayList<String>();
		ar1.add("shadab");
		ar1.add("khushboo");
		ar1.add("home");
		
		ar.addAll(ar1);
		
		
		System.out.println(ar.size());
		for (int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		
		//user define array list
		Employee emp1= new Employee("shadab",30,"Delhi");
		Employee emp2= new Employee("ramesh",31,"Pune");
		Employee emp3= new Employee("suresh",33,"Mumbai");
		Employee emp4= new Employee("mahesh",34,"Banglore");
		
		
	
		
		
		
		  ArrayList<Employee> list= new ArrayList<Employee>(); 
		  list.add(emp1);
		  list.add(emp2); 
		  list.add(emp3); 
		  list.add(emp4);
		  
		  
		  Iterator<Employee> it=list.iterator();
		  while(it.hasNext())
		  { Employee list2=it.next(); 
		  
		  System.out.println(list2.name);
		  System.out.println(list2.age); 
		  System.out.println(list2.city); }
		  
		 
		
		
		
		
	}

	

		
	}

