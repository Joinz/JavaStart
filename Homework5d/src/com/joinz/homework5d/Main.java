package com.joinz.homework5d;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input random string");
		String string = sc.nextLine();
		char[] text = string.toCharArray();
		System.out.println(Arrays.toString(text));
		
		int count = 0;
		for (int i = 0; i < text.length; i++) {
			char b = 'b';
			char ch = string.charAt(i);
			if (ch == b) {
				count++;
			}
		}
		System.out.println("Your text has " + count + " chars b");
		
		sc.close();
	}

}
