package pl.ex24;

import java.util.Scanner;

public class ScannerExample2 {

	public static void main(String[] args) {
		String input = "1 separator 2 separator red separator blue separator 4";
		
		Scanner scanner = new Scanner(input);
		
		scanner.useDelimiter("\\s*separator\\s*"); //whitespace character [ \r\t\n\x0b\f]
		
		int i1 = scanner.nextInt();
		int i2 = scanner.nextInt();
		String s1 = scanner.next();
		String s2 = scanner.next();
		short h1 = scanner.nextShort();
		
		System.out.println(i1 + " " + i2 + " " + s1 + " " + s2 + " " + h1);
		
		scanner.close();
	}

}
