package tharuni;

import java.util.Arrays;

public class Insert {

	public static void main(String[] args) {
		int[] arr= {1,2,3,8};
		int [] array = new int[arr.length+1];
		array[0]=6;
	
		
		for(int i =0; i<arr.length;i++) {
			array[i+1]=arr[i];
		}
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}

	}

}
