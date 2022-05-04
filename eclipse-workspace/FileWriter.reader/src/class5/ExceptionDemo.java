package class5;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		
		Add();
	    Div();

//		try {
//			int a = 100;
//			int b = 50;
//			int[] arr = {3,4,5,6,7}; 
//			System.out.println("result :" + a / b);
//			System.out.println("array :" + arr[6]);
//		} catch (ArithmeticException e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//		} catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//		}
//			finally {
//				System.out.println("processed");
//		}
	

	}
	public static void Add(){
		try {
			int a = 55;
			int b = 3;
			System.out.println("resut of add :" + (a+b));
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Add method is proceesed");
		}
	}
	
	
	public static void Div() {
		try {
			int x = 20;
			int y = 0;
			System.out.println("Div result :" + x/y);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Div method is processed");
		}
	}
	

}
