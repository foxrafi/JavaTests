package pl.ex24;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class ScannerExample4 {

	public static void main(String[] args) {
		File feedFile = new File("src/feed.txt");
		Scanner scanner = null;
		try {
			scanner = new Scanner(feedFile);
			scanner.useDelimiter("[,\\s]+");
			scanner.useLocale(Locale.US);
			
			for(int rowLine=0; rowLine<2; rowLine++){	
				int col1 = scanner.nextInt();
				System.out.print(col1 + " - ");
				
				int col2 = scanner.nextInt();
				System.out.print(col2 + " - ");
				
				double col3 = scanner.nextDouble();
				System.out.print(col3 + " - ");
				
				int col4 = scanner.nextInt();
				System.out.print(col4 + " - ");
				
				int col5 = scanner.nextInt();
				System.out.println(col5);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(scanner != null)
				scanner.close();
		}
	}

}
