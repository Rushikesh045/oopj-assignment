package com.acts.Cdac;
import java.util.Scanner;
public class Question6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);
        System.out.printf("Your BMI is: %.2f\n", bmi);

        String category;
        if (bmi < 18.5)
        {
            category = "Underweight";
        } else if (bmi < 25)
        {
            category = "Normal weight";
        } else if (bmi < 30) 
        {
            category = "Overweight";
        } else
        {
            category = "Obesity";
        }
        System.out.println("Category: " + category);


	}    
}
