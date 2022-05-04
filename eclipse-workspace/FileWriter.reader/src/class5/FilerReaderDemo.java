package class5;

import java.io.BufferedReader;
import java.io.FileReader;

public class FilerReaderDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileReader fr = new FileReader("C:\\Users\\lenovo\\demo.txt");
		BufferedReader br = new BufferedReader(fr);
		String content = br.readLine();
		
		while (content != null){
			System.out.println(content);
			String add[] = content.split(",");
			for (int i=0; i<=add.length; i++) {
				
				System.out.println("Name :" +add[0]);
				System.out.println("Address1 :" +add[1]);
				System.out.println("Address2 :" +add[2]);
				System.out.println("Address3 :" +add[3]);
				System.out.println("City :" +add[4]);
				System.out.println("State :" +add[5]);
				System.out.println("Country :" +add[6]);
			}
			content = br.readLine();
		}
		

	}

}
