package com.joinz.homework5Hc;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("How much money do you have?");
		String howMuch = sc.nextLine();
		
		String answer = "";
		String[] numbers = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
				"eleven", "twelve", "thirteen", "fourteen", "fiveteen", "sixteen", "seventeen", "eighteen", "nineteen" };
		String[] decimals = { "", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety" };
		int money = Integer.valueOf(howMuch);
		if (money < 20) {
			answer += numbers[money] + " dollars";
		} else if (money < 100) {
			answer += decimals[money / 10] + " " + numbers[money % 10] + " dollars";
		}
		System.out.println(answer);
		

	}

}
