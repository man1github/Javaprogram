package class5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	
	public static void main(String[] args) {

		try {
			FileWriter fw = new FileWriter("G:\\FileDemo\\demo.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			for (int i=0; i<6; i++) {
			 bw.write("work");
			 bw.newLine();
			}
			bw.write("Manoj,Sirkali,Mayiladudhurai,609109,India");
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Achieved");
		}
		

	}

}
