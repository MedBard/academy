package by.academy.deal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AmericanPhoneValidator implements Validator {
	Pattern pattern = Pattern.compile("^+1");

	@Override
	public boolean validate(String num) {
		System.out.println(num);
		Matcher m = pattern.matcher(num);
		if (m.find()) {
			
			return true;
		}
		return false;
	}

}
