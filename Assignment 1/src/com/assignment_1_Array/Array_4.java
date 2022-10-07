package com.assignment_1_Array;

import java.util.Scanner;

public class Array_4 {
	public static void main(String[] args) {
		int size, first = 0, second = 0, third = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements want to add");
		size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter The Elements");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("");
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				for (int k = 0; k < size; k++) {
					first = arr[i];
					second = arr[j];
					third = arr[k];
					if (first * first + second * second == third * third) {
						System.out
								.println(first + "*" + first + "+" + second + "*" + second + "==" + third + "*" + third);
					}
				}
			}
		}
		sc.close();
	}
}
