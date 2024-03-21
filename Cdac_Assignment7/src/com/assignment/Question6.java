/* .Print the third-largest number in an array without sorting it 
Input: [ 24,54,31,16,82,45,67]
Output: 54 (82 and 67 are the largest and second-largest)*/
package com.assignment;

import java.util.Scanner;

public class Question6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of an array : ");
		int n=sc.nextInt();
		int[]arr=new int[n];
		System.out.print("Enter element in the array : ");
		for(int i=0;i< n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int largest=Integer.MIN_VALUE;
		int secLargest=Integer.MIN_VALUE;
		int thirdLargest=Integer.MIN_VALUE;
		for(int i=0; i< n; i++)
		{
			if (arr[i] > largest)
			{
                thirdLargest = secLargest;
                secLargest = largest;
                largest = arr[i];
            } 
			else if (arr[i] > secLargest) 
            {
                thirdLargest = secLargest;
                secLargest = arr[i];
            }
			else if (arr[i] > thirdLargest)
				{
                thirdLargest = arr[i];
            }
        	
		}
		System.out.println(thirdLargest);
	}
}
