package by.academy.deal;

import java.util.regex.Pattern;

public class EmailValidator implements Validator {
	private Pattern p = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

	@Override
	public Pattern getPattern() {
		return p;
	}
}
