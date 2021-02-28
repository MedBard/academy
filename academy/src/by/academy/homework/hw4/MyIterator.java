package by.academy.homework.hw4;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyIterator<T> implements Iterator<T> {
	private T[][] array;
	private int rowIndex;
	private int ColumnIndex;

	public MyIterator() {
		super();
	}

	public MyIterator(T[][] array) {
		this.array = array;
	}

	@Override
	public boolean hasNext() {
		return (rowIndex < array.length && ColumnIndex < array[rowIndex].length);
	}

	@Override
	public T next() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		T element = array[rowIndex][ColumnIndex];
		ColumnIndex++;
		while (rowIndex < array.length && ColumnIndex >= array[rowIndex].length) {
			ColumnIndex = 0;
			rowIndex++;
		}
		return element;
	}
}
