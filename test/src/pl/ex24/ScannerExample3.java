package pl.ex24;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerExample3 {
	
	public static void main(String[] args) {
		File f = new File("src/numbers.txt");
		Scanner scanner;
		
		try {
			scanner = new Scanner(f);
			while(scanner.hasNextInt()){
				System.out.println(scanner.nextInt());
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
