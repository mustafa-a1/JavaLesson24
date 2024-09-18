package actionItems;

import java.util.HashMap;
import java.util.Map;

public class Group extends Employee {

	public static void main(String[] args) {
	Map myMap1 = new HashMap();
	
	
	Employee e = new Employee();
	myMap1.put(e.id, e.name);
	myMap1.put(e.id2, e.name2);
	myMap1.put(e.id3, e.name3);
	
	System.out.println(myMap1.entrySet());
	
	}

}
