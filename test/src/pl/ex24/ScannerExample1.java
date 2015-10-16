package pl.ex24;

import java.util.Scanner;

public class ScannerExample1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter an integer number: ");
		
		int value = scanner.nextInt();
		
		System.out.println("You typed this : " + value);
		
		scanner.close();
	}

}
