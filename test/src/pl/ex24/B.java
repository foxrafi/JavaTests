package pl.ex24;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		File f = new File("src/numbers.txt");
		Scanner s;
		try {
			s = new Scanner(f);
			while(s.hasNextInt()){
				System.out.println(s.nextInt());
			}
			s.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		
		String input = "1 fish 2 fish red fish blue fish";
		 Scanner s2 = new Scanner(input).useDelimiter("\\s*fish\\s*");
		 System.out.println(s2.nextInt());
		 System.out.println(s2.nextInt());
		 System.out.println(s2.next());
		 System.out.println(s2.next());
		 s2.close();
	}

}
