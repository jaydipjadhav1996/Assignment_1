package com.assignment_2;

//WAP to demonstrate the use of clone method. Clone one object of Employee class :-

//empId, empName, empSalary and deptname. When you clone object of class
//Employee change the values. With the help of instanceOf check that the newly
//created object is belong to Employee class or not. Also compare both object are same
//or not

public class Program_9 implements Cloneable {
	int empId;
	String empName;
	int empSalary;
	String deptname;

	public Program_9(int empId, String empName, int empSalary, String deptname) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.deptname = deptname;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Program_9 one = new Program_9(101, "Vedant", 12000, "JAVA");
		Program_9 two = new Program_9(102, "AKshay", 1000, "Testing");
		two = (Program_9) one.clone();

		System.out.println(two.deptname);
		System.out.println(two.empId);
		System.out.println(two.empName);
		System.out.println(two.empSalary);

		if (two instanceof Program_9) {
			System.out.println("Yes It Is Object Of Class Program_9");
		}
		System.out.println(one == two);

	}
}
