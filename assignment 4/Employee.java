package com.cdac;

public class Employee {
	String name;
	int rollNo;
	double percentage;

	void display(){
		System.out.println("Name : "+name);
		System.out.println("Roll No : "+rollNo);
		System.out.println("Percentage : "+percentage);
		System.out.println(" \n ");
	}

	void addDetails(String n, int rn, double p){
		name=n;
		rollNo=rn;
		percentage=p;
	}


	void addDetails(int rn, double p){
		rollNo=rn;
		percentage=p;
	}

}
