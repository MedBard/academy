package by.academy.classwork.lesson6;

public class Task2 {

	public static void main(String[] args) {
		String text = "Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно"
				+ "учесть, что слова могут разделяться несколькими пробелами, в начале и конце"
				+ "текста также могут быть пробелы, но могут и отсутствовать.";

		String regex = "\\s+";
		System.out.println(text.split(regex).length);
	}

}
