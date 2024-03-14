package com.acts.Cdac;
import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number 1");
		int num1=sc.nextInt();
		System.out.println("Enter number 2");
		int num2=sc.nextInt();
		System.out.println("Enter Operation 1.Addition 2.Substration 3.Multiplication 4.Division");
		
		switch (sc.nextInt()) {
		case 1:
			int add=num1+num2;
			System.out.println(add);
			break;
		case 2:
			int sub=num1-num2;
			System.out.println(sub);
			break;
		case 3:
			int mul=num1*num2;
			System.out.println(mul);
			break;
		case 4:
			int div=num1/num2;
			System.out.println(div);
			break;	

		default:
			System.out.println("Enter proper operation");
			break;
		}
		
	}

}
