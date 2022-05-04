package Encapsulation;

public class ClassB extends ClassA {
	
	@Override
	public void students() {
		// TODO Auto-generated method stub
		System.out.println("taking notes");
	}

	@Override
	public void teacher() {
		// TODO Auto-generated method stub
		System.out.println("explaining everything");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ClassB ob1 = new ClassB();
		ob1.schoolboard();
		ob1.students();
		ob1.teacher();

	}

	

}
