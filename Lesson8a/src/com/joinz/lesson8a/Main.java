package com.joinz.lesson8a;

import java.io.File;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		
		File fileOne = new File("a.txt");
		try {
			fileOne.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		File folderOne = new File("AAA");
		folderOne.mkdir();
		
		File fileTwo = new File(folderOne, "c.docx");
		try {
			fileTwo.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		fileOne.delete();
		fileTwo.delete();
		folderOne.delete();
		
		
		File workFolder = new File(".");
		File [] files = workFolder.listFiles();
		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i] + "\t" + files[i].length());
		}
		
	}
}
