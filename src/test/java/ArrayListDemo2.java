import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student st= new Student("Shadab",20,"IT");
		Student st2= new Student("ramesh",30,"CS");
		Student st3= new Student("suresh",25,"ME");
		Student st4= new Student("mahesh",24,"EC");
		Student st5= new Student("jagesh",19,"EL");
		
		//System.out.println(st.name+" "+st.age+" "+st.section);
		
		ArrayList<Student> list= new ArrayList<Student>();
		list.add(st);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		list.add(st5);
		
		Iterator<Student> it= list.iterator();
		
		while(it.hasNext())
		{
		Student list2 	=it.next();
		
		System.out.println(list2.name+" "+list2.age+" "+list2.section);
		}
		
		

	}

}
