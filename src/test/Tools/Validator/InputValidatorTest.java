package test.Tools.Validator;

import main.Tools.Constants;
import main.Tools.Generators.GenerateAllCombinations;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class InputValidatorTest extends GenerateAllCombinations {
    Pattern pattern;

    @BeforeEach
    void setUp() {
        pattern = Pattern.compile(Constants.INPUT_REGEX);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void validatorString(){
        String input = "asd";
        Matcher matcher = pattern.matcher(input);
        assertFalse(matcher.matches());
    }

    @Test
    void validatorNumber(){
        String input = "234";
        Matcher matcher = pattern.matcher(input);
        assertTrue(matcher.matches());
    }

    @Test
    void validatorNumberAndString(){
        String input = "a3d";
        Matcher matcher = pattern.matcher(input);
        assertFalse(matcher.matches());
    }

    @Test
    void validatorEmpty(){
        String input = "";
        Matcher matcher = pattern.matcher(input);
        assertTrue(matcher.matches());
    }

    @Test
    void validatorNumber1(){
        String input = "1";
        Matcher matcher = pattern.matcher(input);
        assertFalse(matcher.matches());
    }

    @Test
    void validatorNumber2(){
        String input = "2";
        Matcher matcher = pattern.matcher(input);
        assertTrue(matcher.matches());
    }
}