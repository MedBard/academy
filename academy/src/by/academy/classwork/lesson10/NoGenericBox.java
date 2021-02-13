package by.academy.classwork.lesson10;

public class NoGenericBox<T> {
	private T object;

	public NoGenericBox() {
		super();
	}
	public NoGenericBox(T object) {
		super();
		this.object = object;
	}
	public T getObject() {
		return object;
	}
	public void setObject(T object) {
		this.object = object;
	}

}
