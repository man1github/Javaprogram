package multilevel.inher;

public class Bmw extends Car {
	
	public static void main(String[] args) {
	
		Bmw BMW = new Bmw();
        BMW.engine();
        BMW.carparts();
	}
	
	public void engine() {
		System.out.println("BMW car engine : V6 power engine");
	}
	public void fueleconomy() {
		System.out.println("BMW fuel economy : 15 km/l");
	}
}
