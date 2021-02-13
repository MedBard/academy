package by.academy.deal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DealDate {
	String pattern1 = "\\d{2}-\\d{2}-\\d{4}";
	String pattern2 = "\\d{2}/\\d{2}/\\d{4}";
	String date;
	Date d;

	public DealDate() {
		super();
	}

	public DealDate(String date) {
		super();
		this.date = date;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public boolean checkDate() {
		if (date.matches(pattern1)) {
			try {
				d = new SimpleDateFormat("dd-MM-yyyy").parse(date.trim());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return true;
		}
		if (date.matches(pattern2)) {
			SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd/MM/yyyy");
			return true;
		}
		return false;
	}

	public void printDate() {
		System.out.println("Day: " + d.getDay());
		System.out.println("Month: " + d.getMonth());
		System.out.println("Year: " + d.getYear());
	}
}
