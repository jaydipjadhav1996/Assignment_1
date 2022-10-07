package com.assignment_1_Array;

import java.util.Scanner;

public class Array_1 {
	static int small;

	public static void Print3Smallest(int[] arr, int size) {
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arr[i] > arr[j]) {
					small = arr[i];
					arr[i] = arr[j];
					arr[j] = small;
				}
			}
		}
		System.out.println("Third Smallest number is " + arr[2]);
	}

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

		Print3Smallest(arr, size);
	}
}
