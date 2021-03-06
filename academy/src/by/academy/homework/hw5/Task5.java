package by.academy.homework.hw5;

import java.util.HashMap;
import java.util.Map;

public class Task5 {

	public static void main(String[] args) {
		StringBuilder text = new StringBuilder("Можно писать все в main. Не нужно создавать новых классов.\r\n"
				+ "Имеется текст. Следует составить для него частотный словарь:\r\n"
				+ "Создать Map<Character, Integer> для символов, в который мы заносим символ и его количество.\r\n"
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
