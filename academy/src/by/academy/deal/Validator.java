package by.academy.deal;

import java.util.regex.Pattern;

public interface Validator {

	default boolean validate(String num) {
		return getPattern().matcher(num).matches();
	}
	public Pattern getPattern();
}
