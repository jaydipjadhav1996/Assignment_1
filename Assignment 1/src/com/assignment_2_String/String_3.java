package com.assignment_2_String;

import java.util.Scanner;

public class String_3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String inputString;

		System.out.println("Enter the string  : ");
		inputString = sc.nextLine();
		char[] stringToChar = inputString.toCharArray();
		for (int i = 0; i < stringToChar.length; i++) {
			if (stringToChar[i] >= 'a' && stringToChar[i] <= 'z') {
				stringToChar[i] = (char) (stringToChar[i] - 32);
			} else if (stringToChar[i] >= 'A' && stringToChar[i] <= 'Z') {
				stringToChar[i] = (char) (stringToChar[i] + 32);
			}
		}
		System.out.println("String in Upper Case : ");
		for (int i = 0; i < stringToChar.length; i++) {
			System.out.print(stringToChar[i]);
		}
	}
}
