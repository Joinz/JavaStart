package com.joinz.lesson8b;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {
		
		String[] goodsDescription = new String[] { "Water", "Milk", "Tea", "Wine", "Sidr" };
		int[] goodsPrice = new int[] { 15, 25, 11, 200, 38 };
		int[] goodsCount = new int[] { 240, 5, 117, 40, 312 };
		
		File file = new File("report.csv");
		
		String text = getReport(goodsDescription, goodsPrice, goodsCount);
		
		saveStringToFile(file, text);
		
	}

	public static void saveStringToFile(File file, String text) {
		try(PrintWriter pw = new PrintWriter(file)) {
			pw.println(text);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String getReport(String[] description, int[] price, int[] count) {
		String report = "";
		for (int i = 0; i < count.length; i++) {
			report += description[i] + "," + price[i] + "," + count[i];
			report += System.lineSeparator();
		}
		return report;
	}
}
