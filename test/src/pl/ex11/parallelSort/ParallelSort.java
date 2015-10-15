package pl.ex11.parallelSort;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.imageio.ImageIO;

public class ParallelSort {
	
	static class Result {
		private long sortTime, parallelSortTime;

		public long getSortTime() {
			return sortTime;
		}

		public void setSortTime(long sortTime) {
			this.sortTime = sortTime;
		}

		public long getParallelSortTime() {
			return parallelSortTime;
		}

		public void setParallelSortTime(long parallelSortTime) {
			this.parallelSortTime = parallelSortTime;
		}
	}

	public static void main(String[] args) {
		List<Result> results = new ArrayList<Result>();
		
		int iterationNr = 10;
		
		for(int i=0; i < iterationNr; i++){
			
			Result r = new Result();
			
			int[] data = getData();
			
			//System.out.println("sort");
			r.setSortTime(sortIt(data, false));
			
			//System.out.println("parallelSort");
			r.setParallelSortTime(sortIt(data, true));
			
			results.add(r);
			
		}
		
		long averageSortTime = 0;
		long averageParallelTime = 0;
		
		for(Result res : results){
			averageSortTime += res.getSortTime();
			averageParallelTime += res.getParallelSortTime();
		}
		
		System.out.println("average sort time : " + averageSortTime/iterationNr);
		System.out.println("average parallel time : " + averageParallelTime/iterationNr);
	}
	
	
	public static long sortIt(int[] src, boolean parallel){
		System.out.println("-- Array size : " + src.length);
		
		long start = System.currentTimeMillis();
		
		if(parallel){
			Arrays.parallelSort(src);
		} else {
			Arrays.sort(src);
		}
		
		long end = System.currentTimeMillis();
		
		long elapsedTime = end - start;
		
		System.out.println("-- Elapsed sort time : " + elapsedTime);
		
		return elapsedTime;
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
