package com.assignment_1_Array;

import java.util.Scanner;

public class Array_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		System.out.println("Enter the elements");
		int arr[] = new int[10];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("");

		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
	}
}
