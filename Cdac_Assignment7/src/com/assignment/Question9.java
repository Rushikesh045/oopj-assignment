/*Write a program which generates the series 1,4,27,16,125,36
*/
package com.assignment;

public class Question9 {
	public static void main(String[] args) {
		int length=6;
		int odd=1;
		int even=2;
		for(int i=1;i<=length;i++)
		{
			if(i%2 !=0)
			{
				int x=(int)Math.pow(odd, 3);
				System.out.println(x+" ");
				odd=odd+2;
			}
			else
			{
				int x=(int)Math.pow(even, 2);
				System.out.println(x+" ");
				even=even+2;
			}
		}
	}
}
