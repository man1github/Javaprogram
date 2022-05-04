package work;

public class PatternDemo {

	public static void main(String[] args) {

		// Reverse word

		String name = "hello world";
		String reverse = "";
		for (int k = name.length() - 1; k >= 0; k--) {

			reverse = reverse + name.charAt(k);
		}
		System.out.println(name);
		System.out.println(reverse);

		System.out.println("###############################");

		// triangle pattern
		int row = 6;
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

		System.out.println("###############################");

		// Diamond pattern

		for (int i = 1; i <= 5; i++) {
			for (int j = 5 - i; j > 0; j--) {
				System.out.print(" ");
			}

			System.out.print("     ");

			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}

			System.out.println();
		}

		for (int i = 4; i > 0; i--) {
			System.out.print("     ");

			for (int j = 4 - i; j >= 0; j--) {
				System.out.print(" ");
			}

			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

}
