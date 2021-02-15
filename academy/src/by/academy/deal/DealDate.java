package by.academy.deal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class DealDate {
	static SimpleDateFormat df = new SimpleDateFormat("'Day: '<dd> \n'Month: '<MM>' \nYear: '<yyyy>");
	LocalDate ld = LocalDate.of(1970, 1, 1);
	
	Date date;

	public DealDate() {
		super();
	}

	public DealDate(Date date) {
		super();
		this.date = date;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date parceDate(String date, String pattern) {
		SimpleDateFormat formatter = new SimpleDateFormat(pattern);
		try {
			this.date = formatter.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.date;
	}
	static public void printDealDate(Date date) {
		System.out.println(df.format(date));
	}
}
