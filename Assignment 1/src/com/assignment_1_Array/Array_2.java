package com.assignment_1_Array;

import java.util.Scanner;

public class Array_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		System.out.println("Enter the elements");
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("");
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Duplicates Elements Are :" + arr[i]);
					arr[j] = arr[size - 1];
					size--;
				}
			}
		}
		System.out.println("New Array Without Repeatations");
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}
}
