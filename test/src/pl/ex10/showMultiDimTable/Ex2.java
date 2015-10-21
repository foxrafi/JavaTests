package pl.ex10.showMultiDimTable;

import java.util.Arrays;

public class Ex2 {

	public static void main(String[] args) {
		int[][][] dimension = new int[][][]{
				{
					{
						2,3
					},
					{
						4,5
					},
					{
						6,7
					}
				},
				{
					{
						8,9,10
					}
				},
				{
					{11,12,13,14,15}
				},
				{
					{16,17,18,19,20}
				}
		};
		
		System.out.println(Arrays.deepToString(dimension));
	}

}
