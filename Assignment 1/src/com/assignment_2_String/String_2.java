package com.assignment_2_String;

import java.util.Scanner;

public class String_2 {
	public static void main(String[] args) {
		boolean ans = false;
		Scanner sc = new Scanner(System.in);
		// System.out.print("Enter the first string: ");
		String str1 = "The golden ball";
		// int size_1 = 15;
		// System.out.println("Enter the size of string");
		// int size_2 = sc.nextInt();
		System.out.print("Enter the second string: ");
		String str2 = sc.nextLine();

		for (int i = 0; i < str1.length() - 1; i++) {
			if (str1.charAt(i) == str2.charAt(0)) {
				for (int j = 0; j < str2.length(); j++) {
					if ((i + j) < str1.length() && str2.charAt(j) == str1.charAt(i + j) && j == str2.length() - 1) {
						ans = true;
						break;
					}
				}
			}

		}
		System.out.println("The first string contains second string ->>" + ans);
	}
}
