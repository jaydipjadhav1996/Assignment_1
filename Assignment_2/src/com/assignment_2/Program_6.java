package com.assignment_2;

import java.util.Scanner;

/*
 6) With the help of method overriding perform the string comparison. User will input
two string and your task is to compare both the string one alphabets at a time.*/

public class Program_6 {

	public static int StringCompare(String str1, String str2) {
		int s1 = str1.length();
		int s2 = str2.length();
		int lmin = Math.min(s1, s2);
		for (int i = 0; i < lmin; i++) {
			int str1_ch = (int) str1.charAt(i);
			int str2_ch = (int) str2.charAt(i);

			if (str1_ch != str2_ch) {
				return str1_ch - str2_ch;
			}
			// Edge case for strings like
			// String 1="jay" and String 2="jayjadhav"
			if (s1 != s2) {
				return s1 - s2;
			}
			// If none of the above conditions is true,
			// it implies both the strings are equal
			else {
				return 0;
			}

		}

		return 0;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first string -->>");
		String str1 = sc.nextLine();
		System.out.print("Enter the second string -->>");
		String str2 = sc.nextLine();
		System.out.println("Comparing " + str1 + " and " + str2 + " : " + StringCompare(str1, str2));

	}
}
