package hierarchical.inher;

public class Bmw5Series extends Bmw{
	
	public void  horsepower() {
	    System.out.println("Bmw 5 Series Horse power : 150 Kw");
	}
	public void  engine() {
	    System.out.println("Bmw 5 Series car engine : 3.0L 4-Cylinder");
	}
	
	public static void main(String[] args) {
		
		Bmw5Series BMW5 = new Bmw5Series();
        BMW5.fueleconomy();
        BMW5.engine();
        BMW5.horsepower();
  
	}

}
