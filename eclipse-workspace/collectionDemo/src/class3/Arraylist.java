package class3;

import java.util.*;

public class Arraylist {

	public static void main(String[] args) {

		Student stu = new Student(1, "Manoj", "sirkali");
		Student stu1 = new Student(2, "Mahendiran", "kallakurichi");
		Student stu2 = new Student(3, "vengadesh", "mangaimadam");

		List<Student> ls = new ArrayList<>();
		ls.add(stu);
		ls.add(stu1);
		ls.add(stu2);

		Student stu3 = new Student(4, "kamal", "thirunelveli");
		Student stu4 = new Student(5, "selva", "mannarkudi");

		List<Student> ls1 = new ArrayList<>();
		ls1.add(stu3);
		ls1.add(stu4);

		ls.addAll(1, ls1);
		ls.set(1, stu4);

		for (Student s : ls) {
			System.out.println("Roll no is :" + s.rollno + ", Name is :" + s.name + ", Location is " + s.location);
		}

	}

}
