package by.academy.homework.hw7;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Task2 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
		Person p = new Person();
		User u = new User();
		Class<? extends Person> pClass = p.getClass();
		Class<? extends User> uClass = u.getClass();

		Method getprintUserInfoMethod = uClass.getMethod("printUserInfo");
		System.out.println(getprintUserInfoMethod);

		Method[] gMethods = uClass.getMethods();
		for (Method method : gMethods) {
			System.out.println(method);
		}

		Field pField = pClass.getField("lasttName");
		System.out.println(pField);
		Field[] gFields = pClass.getFields();
		for (Field field : gFields) {
			System.out.println(field);
		}

		Method declaredMethod = uClass.getDeclaredMethod("printUserInfo");
		System.out.println(declaredMethod);
		Method[] declaredMethods = uClass.getDeclaredMethods();
		for (Method method : declaredMethods) {
			System.out.println(method);
		}

		Field declaredField = pClass.getDeclaredField("lasttName");
		System.out.println(declaredField);
		Field[] declaredFields = pClass.getDeclaredFields();
		for (Field field : declaredFields) {
			System.out.println(field);
		}

		
	}

}
