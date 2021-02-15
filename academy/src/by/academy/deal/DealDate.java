package by.academy.deal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DealDate {
	static Pattern p1 = Pattern.compile("(0?[1-9]|[12][0-9]|3[01])-(0?[1-9]|1[012])-((18|19|20|21)\\d\\d)");
	static Pattern p2 = Pattern.compile("(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((18|19|20|21)\\d\\d)");
	static SimpleDateFormat df = new SimpleDateFormat("'Day: '<dd> \n'Month: '<MM>' \nYear: '<yyyy>");
	static SimpleDateFormat dof = new SimpleDateFormat("dd.MM.yyyy");

	public DealDate() {
		super();
	}

	public static Date parceDate(String date, String pattern) {
		SimpleDateFormat formatter = new SimpleDateFormat(pattern);
		Date d = new Date();
		try {
			d = formatter.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return d;
	}

	static public void printDealDate(Date date) {
		System.out.println(df.format(date));
	}

	static public String dateToString(Date date) {
		return dof.format(date);
	}

	static Date checkDate(String gDate, Scanner sc) {
		String pattern1 = "dd-MM-yyyy";
		String pattern2 = "dd/MM/yyyy";
		while (true) {
			Matcher m = p1.matcher(gDate);
			if (m.matches()) {
				return parceDate(gDate, pattern1);
			}
			m = p2.matcher(gDate);
			if (m.matches()) {
				return parceDate(gDate, pattern2);
			}
			System.out.print("Incorrect date! ");
			System.out.print("Enter date(dd/MM/yyyy or dd-MM-yyyy ):");
			gDate = sc.next();
		}
	}
}
