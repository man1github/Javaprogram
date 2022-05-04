package class4;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapDemo {
	
//	   Map - Key and Values
//         - No Duplicates
//         - Only one null can insert
//          
//     Map - HashMap
//         - LinkedHashMap - it follows insertion order
//         - TreeMap       - it follows alphabetical order
//         - HashTable
          
          
	public static void main(String[] args) {
		
	//	HashMap<String, Integer> hm = new HashMap<>();
		HashMap<Integer, String> hm = new HashMap<>();
//		LinkedHashMap<String, Integer> hm = new LinkedHashMap<>();
//		TreeMap<String, Integer> hm = new TreeMap<>();

		
		hm.put(1, "Note");
		hm.put(2, "Book");
		hm.put(3, "Pen");
		hm.put(4, "Pencil");
		hm.put(5, "Bag");
		
//		hm.put("Note", 1);
//		hm.put("Book", 2);
//		hm.put("Pen", 3);
//		hm.put("Pencil", 4);
//		hm.put("Bag", 5);
//		
		System.out.println(hm);
		
//		for (Map.Entry<String, Integer> s : hm.entrySet()) {
//			System.out.println(s);
//		}
		System.out.println("*************************");
		
		for (Map.Entry<Integer, String> s1 : hm.entrySet()) {
			System.out.println(s1.getKey() + "=" + s1.getValue());
		}
		
		

	}

}
