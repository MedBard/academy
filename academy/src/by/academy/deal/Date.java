package by.academy.deal;

import java.text.SimpleDateFormat;

public class Date {
	String pattern1 = "\\d{2}-\\d{2}-\\d{4}";
	SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat(pattern1);
	String pattern2 = "\\d{2}/\\d{2}/\\d{4}";
	SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(pattern2);
	String date;

	public Date() {
		super();
	}

	public Date(String date) {
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
			return true;
		}
		if (date.matches(pattern2)) {
			return true;
		}
		return false;
	}
}
