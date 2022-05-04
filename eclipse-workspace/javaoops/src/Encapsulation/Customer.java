package Encapsulation;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank bank = new Bank();
		
		System.out.println(bank.getName());
		System.out.println(bank.getMinimumbalance());
		
		System.out.println("****After the set value****");
		
		Bank bank1 = new Bank();
		bank1.setName("aaaa");
		bank1.setMinimumbalance(1000);
		
		
		System.out.println(bank1.getName());
		System.out.println(bank1.getMinimumbalance());
		

	}

}
