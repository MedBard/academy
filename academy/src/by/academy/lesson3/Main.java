package by.academy.lesson3;

public class Main {

	public static void main(String[] args) {
		int s = 370_000;
		int sec;
		int m;
		int min;
		int h;
		int days;
		int weeks;

		sec = s % 60;
		m = (s - sec) / 60;
		min = m % 60;
		m = (m - min) / 60;
		h = m % 24;
		m = (m - h) / 24;
		days = h % 7;
		weeks = (m - days) / 7;
		System.out.println(weeks + " weeks " + days + " days " + h + " hours " + min + " minutes " + sec + " seconds");

}
}