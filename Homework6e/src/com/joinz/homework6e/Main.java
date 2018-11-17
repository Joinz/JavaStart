package com.joinz.homework6e;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "a b sdada dasdas ijijji";
		System.out.println(wordsQuantity(s));
		sc.close();
	}
	
<<<<<<< HEAD
	static int wordsQuantity(String s) {
=======
	/**
	 * Counts the number of words.
	 * @param s String
	 * @return <b>int</b> number of words
	 */
	public static int wordsQuantity(String s) {
>>>>>>> refs/remotes/origin/master
		String[] t = s.split("[ ]");
		return t.length;
	}
}
