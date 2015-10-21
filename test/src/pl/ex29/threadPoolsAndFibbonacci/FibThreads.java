package pl.ex29.threadPoolsAndFibbonacci;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FibThreads {

	public static long fib(long i) {
		if (i < 2) 
			return i;
		else
			return fib(i - 1) + fib(i - 2);
	}
	
	
	public static void main(String[] args) {
		
		
		ExecutorService threadPool = Executors.newFixedThreadPool(3);
		
		for(int t = 0; t < 3; t++){
			threadPool.submit(new Runnable(){
				public void run(){
					long start, end;
					for(int c = 0; c < 100; c++){
						start =  System.currentTimeMillis();
						long res  = fib(c);
						end =  System.currentTimeMillis();
						System.out.println(c + " -> " + res + " -> " + (end - start)/1000 + " sec");
					}
				}
			});
			
		}
		threadPool.shutdown();
		try {
			threadPool.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
