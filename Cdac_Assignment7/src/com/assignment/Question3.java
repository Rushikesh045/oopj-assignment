/*Write a Java program to find all pairs of elements in an integer array whose sum is equal to a given number?*/
package com.assignment;

import java.util.Scanner;

public class Question3 {
	 public static void findPairs(int[] arr, int target)
	 {
	        System.out.println("Pairs with sum " + target + " are:");
	        for (int i = 0; i < arr.length - 1; i++) 
	        {
	            for (int j = i + 1; j < arr.length; j++) 
	            {
	                if (arr[i] + arr[j] == target) 
	                {
	                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
	                }
	            }
	        }
	    }
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target sum:");
        int target = sc.nextInt();
        findPairs(arr, target);
    }
}

