/*Write a Java program to check the equality of two arrays?*/
package com.assignment;

import java.util.Arrays;

public class Question2 {
	public static void main(String[] args) {
		boolean t=true;
		int[] arr1= {1,2,3,5};
		int[] arr2= {1,2,4,6};
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i] !=arr2[i])
			{
				t=false;
				break;
			}
		}
		if(t)
		{
			System.out.println("there is equality in two arrays");
		}
		else
		{
			System.out.println("there is no equality in two arrays");
		}
		boolean isEqual=Arrays.equals(arr1, arr2);
		if(isEqual)
		{
			System.out.println("there is equality in two arrays");
		}
		else
		{
			System.out.println("there is no equality in two arrays");
		}
	}
}
