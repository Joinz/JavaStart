package Lesson8c;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		File file = new File("src/lesson8c/Main.java");
		String text = loadStringFromFile(file);
		System.out.println(text);
		
	}

	public static String loadStringFromFile(File file) {
		String text = "";
		try (Scanner sc = new Scanner(file)) {
			
			for ( ; sc.hasNextLine() ; ) {
				text += sc.nextLine();
				text += System.lineSeparator();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return text;
	}
}
