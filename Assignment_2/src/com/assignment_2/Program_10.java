package com.assignment_2;

import java.time.LocalDate;

/*10) WAP to print the object of Employee class with the help of toString method. 
Employee class fields :- empid, empname, empsalary, empaddress, emp_dob, 
emp_doj. use Date class to store the date of birth(dob) and date of joining(doj).*/
class Employee {
	int empid;
	String empname;
	double empsalary;
	String empaddress;
	private LocalDate emp_dob;
	private LocalDate emp_doj;

	public Employee(int empid, String empname, double empsalary, String empaddress, LocalDate emp_dob,
			LocalDate emp_doj) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsalary = empsalary;
		this.empaddress = empaddress;
		this.emp_dob = emp_dob;
		this.emp_doj = emp_doj;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsalary=" + empsalary + ", empaddress="
				+ empaddress + ", emp_dob=" + emp_dob + ", emp_doj=" + emp_doj + "]";
	}

}

public class Program_10 {

	public static void main(String[] args) {
		Employee emp=new Employee(1, "Jaydip", 200000, "Nanded", LocalDate.of(1996, 6, 10),LocalDate.of(2022, 8, 16));
		System.out.println(emp);
	}
}
