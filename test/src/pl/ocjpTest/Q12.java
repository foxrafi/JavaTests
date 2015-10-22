package pl.ocjpTest;

import java.util.ArrayList;

public class Q12 {

	public static void main(String[] args) {
		ArrayList<Integer> i = new ArrayList<Integer>();
		i.add(1);
	
		for(int k=0; k<10; k++)
			new Thread(new Runnable(){
				public void run(){
					System.out.println("As you will see shortly");		
				}
			}).start();		
	}
	
}
