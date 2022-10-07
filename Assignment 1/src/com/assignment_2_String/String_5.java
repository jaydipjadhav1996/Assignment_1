package com.assignment_2_String;

import java.util.Scanner;

public class String_5 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the how many name want to add ?");
		int sizeOfPersonList = in.nextInt();
		String[] listOfName = new String[sizeOfPersonList];

		for (int i = 0; i < sizeOfPersonList; i++) {
			System.out.println("Enter the name of the person : " + (i + 1));
			String name = in.next();
			char[] nameToChar = name.toCharArray();
			listOfName[i] = name;
		}

		for (int i = 0; i < sizeOfPersonList; i++) {
			for (int j = i + 1; j < sizeOfPersonList; j++) {
				if (listOfName[i].toCharArray().length > listOfName[j].toCharArray().length) {
					String temp = listOfName[i];
					listOfName[i] = listOfName[j];
					listOfName[j] = temp;
				}
			}

		}

		System.out.println("Sorted names are : ");
		for (int i = 0; i < sizeOfPersonList; i++) {

			System.out.println(listOfName[i] + " " + listOfName[i].length());
		}

	}

}
