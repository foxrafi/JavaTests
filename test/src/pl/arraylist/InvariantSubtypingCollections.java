package pl.arraylist;

import java.util.ArrayList;

public class InvariantSubtypingCollections {

	public static void main(String[] args) {
		ArrayList<Integer> intArray = new ArrayList<Integer>(100);			//creation of a table with capacity of 100 integers
		//ArrayList<Object>  o = new ArrayList<Object>(100);				//illegal because of invariant subtyping
		ArrayList<Object>  shallowCopy = new ArrayList<Object>(intArray);  	//this is a copy constructor
		
		System.out.printf("%d %d\n",intArray.size(),shallowCopy.size());
		
		Integer[] intArray2 = new Integer[100];								//arrays use covariant subtyping
		Object[] shallowCopy2 = intArray2;
	}

}
