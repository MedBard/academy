package by.academy.classwork.lesson10;

enum Days {
	MONDAY("1"), TUESDAY("2"), WEDNESDAY("3"), THURSDAY("4"), FRIDAY("5"), SATURDAY("6"), SUNDAY("7");

	private String num;

	private Days(String num) {
		this.num = num;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}
}
