package pl.ex3;

public class ArrayDisplayer {

	static void printArrayContent(int[] arr){
		int len = arr.length;
		for(int value : arr){
			if(len != 1)
				System.out.printf("%5d |", value);
			else
				System.out.printf("%5d\n", value);
			len--;
		}
	}

	static void displayArrayWithIndexes(int[] arr){
		System.out.printf("Positions    : ");
						
		int[] indx = new int[arr.length];
		for(int i = 1; i <= arr.length; i++){
			indx[i-1] = i;
		}
		
		printArrayContent(indx);
				
		System.out.printf("Array values : ");		
		printArrayContent(arr);
	}

}
