package com.joinz.lesson7a;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Date dateOne = new Date();
		SimpleDateFormat sdfOne = new SimpleDateFormat("'Today is 'dd.MMMM.y G");
		SimpleDateFormat sdfTwo = new SimpleDateFormat("dd/MM/yyyy");
		String myDay = "11/10/1981";
		
		try {
			dateOne = sdfTwo.parse(myDay);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String result = sdfOne.format(dateOne);
		System.out.println(result);
		result = sdfTwo.format(dateOne);
		System.out.println(result);
		System.out.println(dateOne.getTime());
	}

}
