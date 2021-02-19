package by.academy.deal;

import java.util.regex.Pattern;

public class BelarusPhoneValidator implements Validator{
	private Pattern p = Pattern.compile("\\+375((29)|(33)|(25))[0-9]{7}");
	
	@Override
	public Pattern getPattern() {
		return p;
	}
}
