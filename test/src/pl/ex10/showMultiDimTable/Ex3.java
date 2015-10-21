package pl.ex10.showMultiDimTable;

import java.util.Arrays;

public class Ex3 {
	
	public static void main(String[] args) {
	
		String[][] families = new String[][]{
				
				{"Ann","Rob","Scot","James"},
				
				{"Ann2","Rob2","Scot2","James2"},
				
		};
				
		System.out.println(Arrays.deepToString(families));
	}
	
}
