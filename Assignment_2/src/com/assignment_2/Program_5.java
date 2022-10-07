package com.assignment_2;

import java.util.Scanner;

/*With the help of method overloading create two functions which will accept array of
integer and array of string. With both of the function you have to find out maximum
number and name of maximum length. One function will return the maximum number
and another will return name with maximum length*/
public class Program_5 {

	static int max;
	static String word = "";
	static String large = "";

	public static int Max(int arr[]) {
		int max = arr[0];
		// compare every element with current max
		for (int i = 1; i < arr.length; i++)
			if (arr[i] > max)
				max = arr[i];

		return max;
	}

	public static String Max(String string_arr[]) {
		int maxLength = 0;
		large = null;
		for (String s : string_arr) {
			if (s.length() > maxLength) {
				maxLength = s.length();
				large = s;
			}
		}
		return large;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of int array-->>");
		int arr_size = sc.nextInt();
		System.out.println("Enter the int array elements");
		int arr[] = new int[arr_size];
		for (int i = 0; i < arr_size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Maximum number in array -->>" + Max(arr));
		System.out.print("Enter the size of String array-->>");
		int str_size = sc.nextInt();
		System.out.println("Enter the string array elements");
		String string_arr[] = new String[str_size];

		for (int i = 0; i < str_size; i++) {
			string_arr[i] = sc.next();
		}
		System.out.println("String with maximum length -->>" + Max(string_arr));
	}
}
