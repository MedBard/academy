package by.academy.homework.hw5;

import java.util.HashMap;
import java.util.Map;

public class Task5 {

	public static void main(String[] args) {
		StringBuilder text = new StringBuilder("����� ������ ��� � main. �� ����� ��������� ����� �������.\r\n"
				+ "������� �����. ������� ��������� ��� ���� ��������� �������:\r\n"
				+ "������� Map<Character, Integer> ��� ��������, � ������� �� ������� ������ � ��� ����������.\r\n"
				+ "");
		char[] chars = text.toString().toLowerCase().replaceAll("\\s", "").toCharArray();
		Map<Character, Integer> glossary = new HashMap<Character, Integer>();
		for (char aChar : chars) {
			if (glossary.containsKey(aChar)) {
				glossary.put(aChar, glossary.get(aChar) + 1);
			} else {
				glossary.put(aChar, 1);
			}
		}
		System.out.println(glossary);
	}
}
