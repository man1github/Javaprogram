package hybrid.inher;

public class Car extends Bmw3Series {
	public void fueleconomy() {
		System.out.println("car fuel economy : 10 km/l");
	}

	public static void main(String[] args) {
		Car c = new Car();
		c.fueleconomy();
	}
}
