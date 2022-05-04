package class5;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileWriterDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileWriter  f = new FileWriter("C:\\Users\\lenovo\\demo.txt");
		BufferedWriter b = new BufferedWriter(f);
		b.write("Hello World");
		b.newLine();
		b.write("Name,Address1,Address2,Address3,City,State,Country");
		b.newLine();
		b.write("Manoj,sirkali,mayiladuthurai,mmm,ccc,tamilnadu,India");
		b.close();
		f.close();
		System.out.println("Successfully Done");

	}

}
