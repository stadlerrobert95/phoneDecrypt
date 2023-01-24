package main.Tools.Validators;

import main.Tools.Constants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputValidator {
    public boolean validate (String input){
        Pattern pattern = Pattern.compile(Constants.REGEX);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
}
