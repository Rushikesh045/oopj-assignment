package com.cdac;

public class MainEmployee {
	public static void main(String[] arg){
		Employee emp = new Employee();

		emp.addDetails("Purva",1,70.54f);
		emp.display();

		emp.addDetails(2,75.54f);
		emp.display();
		}

}
