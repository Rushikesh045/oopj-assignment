package com.acts.Cdac;
import java.util.Scanner;
public class Question5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Character");
		char ch=sc.next().charAt(0);
		if(ch=='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u')
		{
			System.out.println("It's a vowel");
		}
		else
		{
			System.out.println("it is not a vowel");
		}
		
	}

}
