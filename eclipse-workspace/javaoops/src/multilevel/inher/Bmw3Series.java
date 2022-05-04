package multilevel.inher;

public class Bmw3Series extends Bmw {
	
	public void  horsepower() {
	    System.out.println("Bmw 3 Series Horse power : 140 Kw");
	}
	public void  engine() {
	    System.out.println("Bmw 3 Series car engine : 2.0L 4-Cylinder");
	}
	
	public static void main(String[] args) {
		
		Bmw3Series BMW3 = new Bmw3Series();
        BMW3.carparts();
        BMW3.fueleconomy();
        BMW3.engine();
        BMW3.horsepower();
  
	}
}
