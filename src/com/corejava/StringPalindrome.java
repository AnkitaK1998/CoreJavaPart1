package com.corejava;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		String rev = "";
		for (int i = str.length() - 1; i >= 0; --i) {
			rev = rev + str.charAt(i);
		}
		System.out.println("reverse of string is: " + rev);
		if (str.equals(rev)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");

		}
	}

}
