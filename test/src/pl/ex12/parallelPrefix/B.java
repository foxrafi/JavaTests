package pl.ex12.parallelPrefix;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.function.IntBinaryOperator;

import javax.imageio.ImageIO;

public class B {
	
	public static class MyIntOperator implements IntBinaryOperator {

		@Override
		public int applyAsInt(int left, int right) {
			return left + right;
		}
		
	}

	public static void main(String[] args) {
		//int[] inputData = getData();
		
		int[] sampleTab = {2, 1, 0, 3};
		System.out.println(Arrays.toString(sampleTab));
		Arrays.parallelPrefix(sampleTab, new MyIntOperator());
		System.out.println(Arrays.toString(sampleTab));
		Arrays.parallelPrefix(sampleTab, new MyIntOperator());
		System.out.println(Arrays.toString(sampleTab));
	}
	
	private static int[] getData(){
		try {
			File file = new File("src/image.png");
			BufferedImage image = ImageIO.read(file);
			int width = image.getWidth();
			int height = image.getHeight();
			int[] src = image.getRGB(0, 0, width, height, null, 0, width);
			int multiply = 50;
			int[] data = new int[src.length * multiply];
			for(int i=0; i<multiply; i++){
				System.arraycopy(src, 0, data, i*src.length, src.length);
			}
			return data;
		} catch (IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}
}
