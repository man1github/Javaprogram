package class3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class hashset {

	public static void main(String[] args) {

//		List - ArrayList and LinkedList
//		       Duplication -- yes
//		       Index        -- Yes
//		       Insertion Order -- Yes
//		       
//		Set  - Duplication -- no
//	           Index        -- no
//	           Insertion Order -- no
//	           
//	    Set - HashSet, LinkedHashSet and TreeSet
//	    
//              HashSet         -  Duplication -- no
//	                             Index        -- no
//	                             Insertion Order -- no	
//	                     
//	          LinkedHashSet   -  Duplication -- no
//                                 Index        -- no
//                                 Insertion Order -- Yes*      
//	             
//
//			*****In Set ,ListIterator is not included*******

		HashSet<String> hs = new HashSet<>();
		hs.add("monitor");
		hs.add("mouse");
		hs.add("keyboard");
		hs.add("CPU");
		hs.add("CPU");
 
		System.out.println(hs); 
		
		for (String s : hs) {
			System.out.println(s);
		}
		System.out.println("---using iterator in hashset---");
		
		hs.add("charger");
		Iterator<String> hs1 = hs.iterator();
		while (hs1.hasNext()) {
			System.out.println(hs1.next());
		}
		System.out.println("******************************");
		
		hs.remove("mouse");
		Iterator<String> hs2 = hs.iterator();
		while (hs2.hasNext()) {
			System.out.println(hs2.next());
		}

		System.out.println("******************************");

		LinkedHashSet<Object> lhs = new LinkedHashSet<>();
		lhs.add("monitor");
		lhs.add("mouse");
		lhs.add("keyboard");
		lhs.add("CPU");

		for (Object s : lhs) {
			System.out.println(s);
		}
		System.out.println("---using iterator in LinkedHashSet---");
		
		lhs.add("charger");
		Iterator<Object> it = lhs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("******************************");
		
		lhs.remove("mouse");
		Iterator<Object> it1 = lhs.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}

	}

}
