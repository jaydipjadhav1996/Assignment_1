package com.assignment_1_Array;

import java.util.Scanner;

public class Array_6 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array ");
		n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter The Elements");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("");

		for (int i = 0; i < n; i++) {
			if ((i + 1) < n) {
				double avg = (arr[i] + arr[i + 1]) / 2;
				System.out.println("Average of two consecutive number " + avg);
			}

		}
	}
}
