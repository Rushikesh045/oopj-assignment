package com.acts.Cdac;
import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year");
		int year=sc.nextInt();
		byConditionalStatement(year);
		bySwitchCase(year);
	}
	public static void byConditionalStatement(int year)
	{
		if (year%4==0 && year%100==0 && year%400==0)
		{
			System.out.println("It's a leap year");
		} 
		else 
		{
			System.out.println("It is not a leap year");
		}

	}
	public static void bySwitchCase(int year)
	{
		 switch (year % 4) {
         case 0:
             if (year % 100 == 0) 
             {
                 if (year % 400 == 0)
                 {
                	 System.out.println("It's a leap year");
                 }
             } 
             else 
             {
            	 System.out.println("It's a leap year");
             }
             break;
         default:
        	 System.out.println("It is not a leap year");
     }
     
	}

}
