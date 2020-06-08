import java.util.HashMap;
import java.util.Map;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<String,String>phonebook= new HashMap<>();
		
		phonebook.put("Naveen","989090999");
		phonebook.put("shadab","867677737");
		phonebook.put("harsh","7837638873");
		
		phonebook.put("suresh","999373738");
		
		System.out.println(phonebook.get("shadab"));
		
	}

}
