package com.assignment_1_Array;

import java.util.Scanner;

public class Array_5 {
	public static void main(String[] args) {
		int size, sum = 0, countEven = 0, countOdd = 0, countPerfect = 0, countPrime = 0, rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array ");
		size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < size; i++) {
			sum = 0;
			System.out.println("value of array at index "+i+" "+ arr[i]);

			while (arr[i] > 0) {
				rem = arr[i] % 10;
				sum = sum + rem;
				arr[i] = arr[i] / 10;
			}
			System.out.println("Sum ->>" + sum);

			if (sum % 2 == 0) {
				countEven++;
			}
			if (sum % 2 != 0) {
				countOdd++;
			}
			if (sum == 2 || sum == 3 || sum == 5 || sum == 7) {
				countPrime++;
			} else if (sum % 2 != 0 && sum % 3 != 0 && sum % 5 != 0 && sum % 7 != 0) {
				countPrime++;
			} else {
				countPerfect++;
			}
		}

		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Even Count :" + countEven);
		System.out.println("Odd Count :" + countOdd);
		System.out.println("Prime :" + countPrime);
		System.out.println("Perfect Count :" + countPerfect);

	}

}
