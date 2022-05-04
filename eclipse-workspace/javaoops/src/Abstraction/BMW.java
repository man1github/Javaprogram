package Abstraction;

public class BMW  extends Car {

	@Override
	public void enginesecret() {
		// TODO Auto-generated method stub
		System.out.println("Bmw engine secret");
	}

	@Override
	public void companyvault() {
		// TODO Auto-generated method stub
		System.out.println("Bmw company vault");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car object = new BMW ();
		object.enginesecret();
		object.companyvault();
		object.employees();
 
	}

}
