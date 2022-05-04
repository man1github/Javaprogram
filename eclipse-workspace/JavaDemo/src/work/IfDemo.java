package work;



public class IfDemo {

	public static void main(String[] args) {

		int val = 32;
		int val1 = 55;
		System.out.println(val+val1);

		int firstval = 50;
		int secondval = 100;

		int result;
		result = firstval + secondval;
		System.out.println("sum of the number:" +result);
		System.out.println("sub of the number:" +(firstval - secondval));
		System.out.println("mul of the number:" +(firstval * secondval));
		System.out.println("div of the number:" +(secondval / firstval));
	
		//1-if class examples
		
		int mark = 35;
		
		if (mark > 35) {
			System.out.println("Pass");
		}
		else if(mark == 35){
			System.out.println("Just pass");

		}
		else {
			System.out.println("Fail");

		}	
		
	}
}


