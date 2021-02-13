package by.academy.deal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DealDate {
	String pattern1 = "\\d{2}-\\d{2}-\\d{4}";
	String pattern2 = "\\d{2}/\\d{2}/\\d{4}";
	String date;
	LocalDate ld = LocalDate.of(1970, 1, 1);
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

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
			
			return true;
		}
		if (date.matches(pattern2)) {
			return true;
		}
		return false;
	}

	public void printDate() {
		ld = ld.plusYears(30);
		ld = ld.minusMonths(7);
		ld = ld.minusDays(3);
		System.out.println(ld);
	}
}
