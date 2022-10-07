package com.assignment_2;

import java.util.Scanner;

/*
2) Create class/interface Shape which will have only one method area. Create class
Triangle, Sphere and Circle all will extends/implements Shape. In class Triangle,
Sphere and Circle depending upon the type of shape you have to take the input from
the user to calculate the area of the different shape.
*/

interface Shape {
	void area(int a, int b);
}

class Triangle implements Shape {

	@Override
	public void area(int a, int b) {
		double ar = Math.abs(0.5 * a * b);
		System.out.println("area of triangle  " + ar);
	}
}

class Sphere implements Shape {

	double r;

	public void area(int a, int b) {
		r = a;
		double area = 4 * 3.14 * r * r;
		System.out.println("Area of sphere  " + area);

	}

}

class Circle implements Shape {

	double pi = 3.14;

	@Override
	public void area(int a, int b) {
		double ar = pi * a * a;
		System.out.println("Area of circle:" + ar);
	}
}

public class Program_2 {
	public static void main(String[] args) {
		boolean loop;
		while (loop = true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Select the option -->> 1).Triangle 2).Sphere 3).Circle 4).None");
			int option = sc.nextInt();
			if (option == 1) {
				System.out.println("Enter the height");
				int a = sc.nextInt();
				System.out.println("Enter the widgth");
				int b = sc.nextInt();
				Triangle t = new Triangle();
				t.area(a, b);

			} else if (option == 2) {
				System.out.println("Enter the radious");
				int a = sc.nextInt();
				Sphere s = new Sphere();
				s.area(a, a);
			} else if (option == 3) {
				System.out.println("Enter the radious");
				int radious = sc.nextInt();
				Circle cr = new Circle();
				cr.area(radious, radious);

			} else if (option == 4) {
				break;
			} else {
				System.out.println("Bad Input");
			}
		}
	}
}
