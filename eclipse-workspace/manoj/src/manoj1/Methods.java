package manoj1;


public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Methods md = new Methods();
		md.Sum();
		md.Sum(20, 30);

		double z;
		z = Sum(11.5, 9.5);
		System.out.println("with return :" + z);
	}

	void Sum() {
		int x = 5;
		int y = 10;
		int z = 0;
		z = x + y;
		System.out.println("with out param :" + z);
	}

	void Sum(int x, int y) {
		int z = 0;
		z = x + y;
		System.out.println("with param :" + z);
	}

	static double Sum(double x, double y) {
		double z = 0.0;
		z = x + y;
		return z;
	}

}
	
