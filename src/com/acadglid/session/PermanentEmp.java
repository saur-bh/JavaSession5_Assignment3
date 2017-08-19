/*
 * PermanentEmp which extends Employee class 
	Properties:
		int paid_leave, sick_leave, casual_leave
		double basic, hra,pfa

	Methods overides : 
		void print_leave_details() 
		@Override	
		void calculate_balance_leaves()
		@Override
  		boolean avail_leave(int no_of_leaves,char type_of_leave) 
  		@Override
  		void calculate_salary()

  		Pf = 12% of basic hra
= 50% of basic

 */

package com.acadglid.session;



public class PermanentEmp extends Employee {

	int paid_leave, sick_leave, casual_leave =0;
	double basic, hra,pfa;
	boolean availLeave = false ;
	int leave_taken;


	@Override
	void calculate_balance_leaves() {



		leave_taken = paid_leave + sick_leave + casual_leave ;




	}

	@Override
	boolean avail_leave(int no_of_leaves, char type_of_leave) {

		boolean flag = false;

		//Check the type of leave and accordingly add in type of leave

		switch (type_of_leave) {

		case 'p':

			paid_leave = paid_leave + no_of_leaves;
			flag = true;
			break;
		case 's':
			sick_leave = sick_leave + no_of_leaves ;
			flag = true;
			break;
		case 'c':
			casual_leave = casual_leave + no_of_leaves ;
			flag = true;
			break;
		default:

			System.out.println("You have not enter valid leave type :");
			flag = false;
			break;


		}


		return flag;
	}

	@Override
	void calculate_salary() {

		hra = 0.5*(basic);  // HRA is 50% of basic i.e. .5*HRA 
		pfa = 0.12*hra;		//12 % of HRA
		total_salary= basic+hra-pfa;

		System.out.println("Hi..!"+empName+"  total salary which is calculate for the month is : "+total_salary); //total_sal = basic + hra – pf

	}


	void print_leave_details() {


		calculate_balance_leaves();

		System.out.println(" You have pending leaves--> "+(total_leaves-leave_taken));



	}

}
