/*
 * 
 * Temporary employee class which extend Employee class 
 No new properties
 Methods: 
 	override void calculate_balance_leaves() 
 	override boolean avail_leave(int no_of_leaves, char type_of_leave)
	override void calculate_salary()
 */


package com.acadglid.session;

public class TemporaryEmp extends Employee {

	char type_of_leave ='X';
	int no_of_leaves = 10;

	@Override
	void calculate_balance_leaves() {

		if(true)
		{
			System.out.println("Total leave for temporary employee" + total_leaves);
		}

	}

	@Override
	boolean avail_leave(int no_of_leaves, char type_of_leave) {

		total_leaves = total_leaves - no_of_leaves;
		System.out.println("Temporary employee leaves "+ total_leaves);
		return true;
	}

	@Override
	void calculate_salary() {

		//Since temporary employee ;PF and HRA will be calculated by parent company



		System.out.println("Hi..!"+empName+"  total salary which is calculate for the month is : "+total_salary); //total_sal = basic + hra – pf

	}

}
