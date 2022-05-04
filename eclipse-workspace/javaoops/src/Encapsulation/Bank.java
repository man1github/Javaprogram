package Encapsulation;

public class Bank {
	
	private String name = "ghjk";
	private int minimumbalance = 500;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMinimumbalance() {
		return minimumbalance;

	}

	public void setMinimumbalance(int minimumbalance) {
		
		this.minimumbalance = minimumbalance;

//		if (minimumbalance > 500) {
//
//			this.minimumbalance = minimumbalance;
//			System.out.println("setMinimumbalance is :" + this.minimumbalance);
//		} else {
//
//			System.out.println("it below the limits");
//		}
	}

}
