package main.tools.validators;

import main.tools.Constants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputValidator {
    public boolean validate(String input){
        Pattern pattern = Pattern.compile(Constants.INPUT_REGEX);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
}
