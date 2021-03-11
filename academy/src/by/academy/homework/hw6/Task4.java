package by.academy.homework.hw6;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task4 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		File dir = new File("tmp");
		if (!dir.exists()) {
			dir.mkdir();
		}

		try (FileReader reader = new FileReader("Text.txt")) {
			int c;
			while ((c = reader.read()) != -1) {
				sb.append((char) c);
			}
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

		for (int i = 0; i < 100; i++) {
			int k = (int) (Math.random() * sb.length());
			File file = new File(dir, i + ".txt");
			try (FileWriter writer = new FileWriter(file)) {
				file.createNewFile();
				writer.write(sb.substring(0, k));
			} catch (IOException ex) {
				System.out.println(ex.getMessage());
			}
		}

		File file = new File("Task4_result.txt");
		try (FileWriter writer = new FileWriter(file)) {
			for (File f : dir.listFiles()) {
				writer.append(f.getName() + " " + f.length() + "\n");
			}
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
