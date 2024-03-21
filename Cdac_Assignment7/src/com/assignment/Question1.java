/* Write a program to print elements of Array ? */
package com.assignment;
import java.util.*;
public class Question1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Print 
        System.out.println("Elements in array:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        // Print using Arrays.toString()
        System.out.println("Array as string: " + Arrays.toString(arr));

        // Print  using a simple loop
        System.out.println("Printing array using a simple loop:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}