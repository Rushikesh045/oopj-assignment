/*Write a program which takes an array of integers and prints the running average of 3 consecutive integers. 
In case the array has fewer than 3 integers, there should be no output.
 Input: [5,14,35,89,140]
Output: [18, 46, 88] 
(Explanation: 18=(5+14+35/3, 46=(14+35+89)/3, ...)
*/

package com.assignment;

public class Question8 {
	public static void main(String[] args) {
		int[] arr= new int[]{5,14};
		if (arr.length < 3)
		{
            System.out.println("Array element should be more than 3");
            return;
        }

        int[] outputArray = new int[arr.length - 2];

        for (int i = 0; i <= arr.length - 3; i++)
        {
            int sum = arr[i] + arr[i + 1] + arr[i + 2];
            outputArray[i] = sum / 3;
        }

       
        for (int i = 0; i < outputArray.length; i++)
        {
            System.out.print(outputArray[i]+" ");
        }
       
	}
}
