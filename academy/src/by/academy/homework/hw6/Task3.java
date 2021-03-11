package by.academy.homework.hw6;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Task3 {

	public static void main(String[] args) throws IOException {
		ArrayList<User> users = new ArrayList<>();
		users.add(new User("1", "one", 20));
		users.add(new User("2", "one", 21));
		users.add(new User("3", "one", 22));
		users.add(new User("4", "one", 23));
		users.add(new User("5", "one", 24));
		users.add(new User("6", "one", 25));
		users.add(new User("7", "one", 26));
		users.add(new User("8", "one", 27));
		users.add(new User("9", "one", 28));
		users.add(new User("10", "one", 29));

		File dir = new File("users");
		if (!dir.exists()) {
			dir.mkdir();
		}

		for (User user : users) {
			String fileName = user.getName() + "_" + user.getSurname() + ".txt";
			File personalFile = new File(dir, fileName);
			try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(personalFile))) {
				oos.writeObject(user);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
