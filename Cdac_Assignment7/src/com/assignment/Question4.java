/*Write a program to reverse an Array in java */

package com.assignment;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        for(int i=arr.length-1;i>=0;i--)
        {
        	
        	System.out.println("Reverse Array "+ arr[i]);
        	
        }
	}

}
