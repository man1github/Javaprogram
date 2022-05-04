package class3;

import java.util.*;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu = new Student(1,"Manoj","sirkali");
		Student stu1 = new Student(2,"Mahendiran","kallakurichi");
		Student stu2 = new Student(3,"vengadesh","mangaimadam");
	
		
		LinkedList <Student> ls = new LinkedList<>();
		ls.add(stu);
		ls.add(stu1);
		ls.add(stu2);
		
		for (Student s : ls) {
			System.out.println("Roll no is :" + s.rollno + ", Name is :" + s.name + ", Location is " + s.location);
		}
		

	}

}
