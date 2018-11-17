package com.joinz.homework8a;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {

		File file = new File("a.txt");
		readFile(file);

	}
	
	public static void readFile(File file) {
		if (file.exists()) {
			String text = "";
			try (Scanner sc = new Scanner(file)) {
				for ( ; sc.hasNextLine() ; ) {
					text += sc.nextLine();
					text += System.lineSeparator();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println(text);
		}
	}
	
	public static void redactFile(File file) {
		
	}
}
