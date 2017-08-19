
/*
 * Write a program that will compute an Employee's salary and manage their leave details.
 */

package com.acadglid.session;



public class Assignment3 {

	public static void main(String[] args) {


		//create object of permanent employee 

		PermanentEmp emp_permanent =  new PermanentEmp();

		//get details of the employee 

		emp_permanent.getEmployeeDetails();

		// get employee basic salary 

		emp_permanent.basic = 20000.00;

		//Calculate Salary

		emp_permanent.calculate_salary();

		// Apply leaves for 4 days  casual leave 

		emp_permanent.avail_leave(4,'c');

		// Print leaves 

		emp_permanent.print_leave_details();

		//temporary employee 

		TemporaryEmp emp_temp = new TemporaryEmp();


		//get details of the employee 

		emp_temp.getEmployeeDetails();

		//Calculate Salary

		emp_temp.total_salary = 15000.00;

		emp_temp.calculate_salary();

		// Apply leaves for 4 days  casual leave 

		emp_temp.avail_leave(4,'c');






	}

}
