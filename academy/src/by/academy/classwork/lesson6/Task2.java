package by.academy.classwork.lesson6;

public class Task2 {

	public static void main(String[] args) {
		String text = "������� ������ � �������. ���������� ���������� ���� � ������. ����������"
				+ "������, ��� ����� ����� ����������� ����������� ���������, � ������ � �����"
				+ "������ ����� ����� ���� �������, �� ����� � �������������.";

		String regex = "\\s+";
		System.out.println(text.split(regex).length);
	}

}
