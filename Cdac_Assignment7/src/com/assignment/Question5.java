/*Find out smallest and largest number in a given Array? */
package com.assignment;

import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        /*int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;*/
        int min = arr[0];
        int max = arr[0];
        for(int i=1; i<n; i++)
        {
        	if(arr[i]<min)
        	{
        		min=arr[i];
        	}
        	else if(arr[i]>max)
        	{
        		max=arr[i];
        	}
        }
        System.out.println("smallest number : "+min);
       
        System.out.println("Largest number : "+max);
	}
}
