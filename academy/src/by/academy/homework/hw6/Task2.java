package by.academy.homework.hw6;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task2 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		try (FileReader reader = new FileReader("Text.txt")) {
			int c;
			while ((c = reader.read()) != -1) {
				if (' ' != ((char) c)) {
					sb.append((char) c);
				}
			}
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

		File file = new File("Result.txt");
		try (FileWriter writer = new FileWriter(file)) {
			file.createNewFile();
			writer.write(sb.toString());
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
