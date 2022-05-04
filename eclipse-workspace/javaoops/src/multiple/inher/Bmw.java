package multiple.inher;

public class Bmw implements Bmw3series, Bmw5series {
	public static void main(String[] args) {
		Bmw b = new Bmw();
		b.engine();
	}

	@Override
	public void engine() {
		System.out.println("Bmw engine : 2.0L 4-Cylinder");
	}
}
