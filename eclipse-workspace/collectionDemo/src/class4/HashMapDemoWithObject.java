package class4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemoWithObject {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(1, "Manoj", "Jr.Software", "Office");
		Employee emp2 = new Employee(2, "Guru", "Jr.Software", "Home");
		Employee emp3 = new Employee(3, "Mahesh", "Sr.Software", "Home");
		Employee emp4 = new Employee(4, "Yusuf", "Sr.Software", "Office");

		
		HashMap<Employee, String> hm = new HashMap<>();
		hm.put(emp1, "emp1");
		hm.put(emp2, "emp2");
		hm.put(emp3, "emp3");
		hm.put(emp4, "emp4");
		hm.put(new Employee (5, "Harish", "Trainee", "Office"), "emp5");
		
		for (Map.Entry<Employee, String> e : hm.entrySet()) {
			System.out.println(e.getKey() + "=" + e.getValue());
		}
		
		
		

	}

}
