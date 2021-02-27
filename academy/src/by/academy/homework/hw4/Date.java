package by.academy.homework.hw4;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Date {
	static Pattern p1 = Pattern.compile("(0?[1-9]|[12][0-9]|3[01])-(0?[1-9]|1[012])-((18|19|20|21)\\d\\d)");
	Day day;
	Month month;
	Year year;

	public enum DaysOFWeek {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY,
	}

	public Date(String date, Scanner sc) {
		date = validateDate(date, sc);
		String[] subStr = parceDate(date);
		this.day = new Day(Integer.parseInt(subStr[0]));
		this.month = new Month(Integer.parseInt(subStr[1]));
		this.year = new Year(Integer.parseInt(subStr[2]));
	}

	class Day {
		int day;

		public Day(int day) {
			super();
			this.day = day;
		}

		public int getDay() {
			return day;
		}

		public void setDay(int day) {
			this.day = day;
		}

	}

	class Month {
		int month;

		public Month(int month) {
			super();
			this.month = month;
		}

		public int getMonth() {
			return month;
		}

		public void setMonth(int month) {
			this.month = month;
		}

	}

	public class Year {
		int year;

		public Year(int year) {
			super();
			this.year = year;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

	}

	public static void countDays(Date d1, Date d2) {
		LocalDate dateBefore = LocalDate.of(d1.year.getYear(), d1.month.getMonth(), d1.day.getDay());
		LocalDate  dateAfter = LocalDate.of(d2.year.getYear(), d2.month.getMonth(), d2.day.getDay());
		System.out.println(Math.abs(ChronoUnit.DAYS.between(dateBefore, dateAfter)) + " days between "+ dateBefore.toString() + " and " +dateAfter.toString());
	}

	public void checkYear() {
		if (java.time.Year.of(this.year.getYear()).isLeap()) {
			System.out.println("Year " + this.year.getYear() + " is leap");
		} else {
			System.out.println("Year " + this.year.getYear() + " is not leap");
		}
	}

	public void dayOfWeek() {
		LocalDate ld = LocalDate.of(this.year.getYear(), this.month.getMonth(), this.day.getDay());
		DayOfWeek weekday = ld.getDayOfWeek();
		switch (weekday) {
		case MONDAY:
			System.out.println(DaysOFWeek.MONDAY);
			break;
		case TUESDAY:
			System.out.println(DaysOFWeek.TUESDAY);
			break;
		case WEDNESDAY:
			System.out.println(DaysOFWeek.WEDNESDAY);
			break;
		case THURSDAY:
			System.out.println(DaysOFWeek.THURSDAY);
			break;
		case FRIDAY:
			System.out.println(DaysOFWeek.FRIDAY);
			break;
		case SATURDAY:
			System.out.println(DaysOFWeek.SATURDAY);
			break;
		case SUNDAY:
			System.out.println(DaysOFWeek.SUNDAY);
			break;
		default:
			break;
		}
	}

	private String[] parceDate(String date) {
		String delimeter = "-";
		return date.split(delimeter);
	}

	public void printDate() {
		System.out.println(
				"Day:" + this.day.getDay() + " Month:" + this.month.getMonth() + " Year:" + this.year.getYear());
	}

	private String validateDate(String gDate, Scanner sc) {
		while (true) {
			Matcher m = p1.matcher(gDate);
			if (m.matches()) {
				return gDate;
			}
			System.out.print("Incorrect date! ");
			System.out.print("Enter date(dd-MM-yyyy):");
			gDate = sc.next();
		}
	}
}
