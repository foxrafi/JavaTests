package pl.ex14;

import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		FileWriter fw;
		try {
			fw = new FileWriter("output2.txt", true);
		
			fw.append("Alis has got a cat");
		
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
