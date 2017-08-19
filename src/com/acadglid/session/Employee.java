

/*Create an class Employee with following properties and functions
	Properties:
		int empId
		String empName 
		int total_leaves 
		double total_salary

	Methods:
		void calculate_balance_leaves(); 
		boolean avail_leave(int no_of_leaves, char type_of_leave); 
		void calculate_salary();
 * 
 */

package com.acadglid.session;

import java.util.Scanner;

public abstract class Employee {

	int empID;
	String empName;
	int total_leaves ;
	double total_salary;
	Scanner sc = new Scanner(System.in);

	abstract void calculate_balance_leaves();
	abstract boolean avail_leave(int no_of_leaves, char type_of_leave); 
	abstract void calculate_salary();

	void getEmployeeDetails() {

		// Get the Name of the Employee 
		System.out.println("Please Enter the Name of the Employee");

		empName = sc.nextLine();

		System.out.println("Enter the employeeID");
		empID = sc.nextInt();

		System.out.println("Enter the total number of leaves in your organzation");
		total_leaves = sc.nextInt();

	}


}
