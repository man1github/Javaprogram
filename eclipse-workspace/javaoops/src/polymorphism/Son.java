package polymorphism;

public class Son extends Parents {
	
	@Override
	public void marraige() {
		System.out.println("My marraige my rules");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parents parents = new Son();
		parents.marraige();
		parents.property();

	}

}
