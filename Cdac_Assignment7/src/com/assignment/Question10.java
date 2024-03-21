/*Given an array of integers, print whether the numbers are in ascending order or in descending order or in random order without sorting
 Input: [5,14,35,90,139] Output: Ascending 
 Input: [88,67,35,14,-12] Output: Descending
Input: [65,14,129,34,7] Output: Random 
*/
package com.assignment;

public class Question10 {

	public static void main(String[] args) {
		int[] arr= {88,67,35,14,-12};
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<arr[i+1])
			{	
				System.out.println("Ascending");
				break;
			}
			else if(arr[i]>arr[i+1])
			{
				System.out.println("Descending");
				break;
			}
			else
			{
				System.out.println("Random");
				break;
			}
		}
	}

}
