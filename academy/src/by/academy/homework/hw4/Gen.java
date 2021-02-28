package by.academy.homework.hw4;

import java.util.Arrays;

public class Gen<T> {
	int counter = 0;
	T[] array;

	@SuppressWarnings("unchecked")
	public Gen() {
		this.array = (T[]) new Object[16];
	}

	@SuppressWarnings("unchecked")
	public Gen(int i) {
		this.array = (T[]) new Object[i];
	}

	public void add(T obj) {
		if (counter == getArraySize()) {
			expandArray();
		}
		array[counter++] = obj;
	}

	public void remove(int i) {
		if (i > counter || i < 0) {
			System.out.println("Incorrect choose");
			return;
		}
		T[] copy = Arrays.copyOfRange(array, i + 1, counter);
		for (int j = 0; j < copy.length; i++, j++) {
			array[i] = copy[j];
		}
		counter--;
		array[counter] = null;
	}

	public void remove(T obj) {
		for (int i = 0; i < getArraySize(); i++) {
			if (obj.equals(array[i])) {
				remove(i);
			}
		}
	}

	public T get(int i) {
		if (i > counter || i < 0 || counter == 0) {
			System.out.println("Incorrect index!");
			return null;
		} else {
			return array[i];
		}
	}

	public T getLast() {
		if (counter == 0) {
			System.out.println("Empty array");
			return null;
		}
		return array[counter - 1];
	}

	public int getLastFilling() {
		return counter - 1;
	}

	public T getFirst() {
		if (counter == 0) {
			System.out.println("Array is empty!");
			return null;
		} else {
			return array[0];
		}
	}

	public int getArraySize() {
		return array.length;
	}

	private void expandArray() {
		T[] copy = Arrays.copyOf(array, array.length * 2 + 1);
		array = copy;
	}

	@Override
	public String toString() {
		return "Gen [array=" + Arrays.toString(array) + "]";
	}
}
