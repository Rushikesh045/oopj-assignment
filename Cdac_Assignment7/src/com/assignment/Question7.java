/*Write a program to merge two arrays of integers by reading one number at a time from each array until  one of the array is exhausted, and then concatenating the remaining numbers.
 Input: [23,60,94,3,102] and [42,16,74]
 Output: [23,42,60,16,94,74,3,102]
*/
package com.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Question7 {
	public static void main(String[] args) {
		int arr1[]= {23,60,94,3,102};
		int arr2[]= {42,16,74};
		System.out.println("int arr1[]= {23,60,94,3,102} ");
		System.out.println("int arr2[]= {42,16,74} ");
		int merged[]=new int[arr1.length+arr2.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<arr1.length && j<arr2.length) {
			merged[k++]=arr1[i++];
			merged[k++]=arr2[j++];
		}
		while(i<arr1.length) {
			merged[k++]=arr1[i++];
		}
		while(j<arr2.length) {
			merged[k++]=arr2[j++];
		}
		System.out.print("Merged array is:");
		System.out.print(Arrays.toString(merged));
		

	}
}
