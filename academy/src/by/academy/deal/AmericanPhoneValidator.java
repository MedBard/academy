package by.academy.deal;

import java.util.regex.Pattern;

public class AmericanPhoneValidator implements Validator {
	private Pattern p = Pattern.compile("\\+1[0-9]{10}");

	@Override
	public Pattern getPattern() {
		return p;
	}

}
