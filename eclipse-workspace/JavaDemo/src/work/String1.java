package work;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String name = "Hariharan";
		String name1 = "PraveeN";
		String name2 = "Praveen";
		String name3 = " ";
		String name4 = "";
		String name5 = "  friends name  ";


		
		
		System.out.println("length of the name: " +name.length());
		System.out.println("Join the Names: " +name.concat(" ").concat(name1));
		System.out.println("Replace the name's letter: " +name.replace("ha", "ss"));
		System.out.println("Uppercase of name: " +name.toUpperCase());
		System.out.println("LowerCase of name: " +name.toLowerCase());
		System.out.println("Character of the name: " +name.charAt(0));
		System.out.println("indexOf the name: " +name.indexOf('h'));
		System.out.println("substring of the name: " +name.substring(1));
		System.out.println("substring of the name: " +name.substring(4, 8));
		System.out.println("startsWith of the name: " +name.startsWith("Har"));
		System.out.println("endsWith of the name: " +name.endsWith("ran"));
		System.out.println("contains of the name: " +name.contains("ha"));
		System.out.println("equals the name: " +name1.equals(name2));
		System.out.println("equalsIgnoreCase the name: " +name1.equalsIgnoreCase(name2));
		System.out.println("Empty the name: " +name4.isEmpty());
		System.out.println("Blank the name: " +name4.isBlank());
		System.out.println("trim the name: " +name5.trim());
		System.out.println("Before trim the name: " +name5);
		System.out.println("trim the name: " +name5.trim().length());
		System.out.println("length of the name: " +name5.length());






		
		

	}

}
