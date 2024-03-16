/* 2)Write a Vehicle class with overloaded methods that have a different number of parameters. 
Demonstrate calling these overloaded methods with various numbers of arguments. */

package com.cdac;
import java.util.Scanner;

public class Vehicle {
	String name ="Swift";
    int price=1050000;
    String category="SUV";

    public void displayDetails() {
    	
        System.out.println("Name : " + name);
        System.out.println("Price : " + price);
        System.out.println("Category : " + category);
        System.out.println(" \n ");
    }

    public void setDetails() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Vehicle Name: ");
        name = sc.nextLine();

        System.out.print("Enter price: ");
        price=sc.nextInt();

        System.out.print("Enter category: ");
        category=sc.next();

        sc.close();
    }

    public void setDetails(String name, int price, String category){
        this.name=name;
        this.price=price;
        this.category=category;
    }

    public void setDetails(String n, int p){
        this.name=n;
        this.price=p;
    }

}
