package class3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Collection {

	public static void main(String[] args) {

		ArrayList<Object> lst = new ArrayList<>();
		// List<String> lst = new ArrayList<>();

		lst.add("Realme");
		lst.add("Redmi");
		lst.add("oppo");
		lst.add("micromax");
		lst.add(45);

		System.out.println(lst);

		// Incase we entered either string or integer in syntax, then 'Object' changes
		// into similar datatype.

		for (Object p : lst) {
			System.out.println(p);
		}
		System.out.println("***********************");

		System.out.println(lst.isEmpty());
		System.out.println(lst.subList(1, 4));

		lst.remove("Realme");
		lst.remove(3);

		System.out.println("---removed the elements---");

		for (int i = 0; i < lst.size(); i++) {
			System.out.println(lst.get(i));
		}

		System.out.println("---Adding the elements---");

		lst.add(0, "nokia");
		System.out.println(lst.indexOf("nokia"));
		System.out.println(lst.lastIndexOf("Redmi"));
		;

		lst.forEach(a -> {
			System.out.println(a);

		});

		System.out.println("---By using iterator---");

		lst.add(0, "poco");
		Iterator<Object> lst1 = lst.iterator();
		while (lst1.hasNext()) {
			System.out.println(lst1.next());
		}

		System.out.println("---By using list iterator(next)---");

		ListIterator<Object> lst2 = lst.listIterator();
		while (lst2.hasNext()) {
			System.out.println(lst2.next());
		}

		System.out.println("---By using list iterator(previous)---");

//		ListIterator lst3 = lst.listIterator();
		while (lst2.hasPrevious()) {
			System.out.println(lst2.previous());
		}

	}

}
