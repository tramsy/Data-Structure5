package com.datastructure;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) 
	{
		InsertionSort obj = new InsertionSort();
		
		int[] numbers = {23,1,43,64,5,21,44,32,5};
		obj.sort(numbers);
		System.out.println(Arrays.toString(numbers));

	}
	
	void sort(int[] arry)
	{
		for(int i=1; i<arry.length; i++)
		{
			int current = arry[i];
			int j = i-1;
			while(j>=0 && arry[j]>current)
			{
				arry[j+1] = arry[j];
				j--;
			}
			arry[j+1] = current;
		}
	}
}
