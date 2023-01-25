package Tools.Validator;

import main.Tools.Validators.InputValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputValidatorTest extends InputValidator {
    InputValidator validator;
    @BeforeEach
    void setUp() {
        validator = new InputValidator();
    }


    @Test
    void validatorString(){
        String input = "asd";
        boolean actual = validator.validate(input);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void validatorNumberMaxLength(){
        String input = "2344";
        boolean actual = validator.validate(input);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void validatorNumberAndString(){
        String input = "a3d";
        boolean actual = validator.validate(input);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void validatorEmpty(){
        String input = "";
        boolean actual = validator.validate(input);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void validatorNumber1(){
        String input = "1";
        boolean actual = validator.validate(input);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void validatorAboveMaxLength(){
        String input = "23456";
        boolean actual = validator.validate(input);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void validatorNumberSingle(){
        String input = "2";
        boolean actual = validator.validate(input);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void validatorNull() throws NullPointerException {
        String input = null;
        NullPointerException exception = assertThrows(NullPointerException.class,
                                            () -> validator.validate(input));
        assertTrue(exception.getMessage().contains("null"));
    }
}