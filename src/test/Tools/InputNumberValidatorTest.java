package test.Tools;

import main.Tools.Generators.GenerateAllCombinations;
import main.Tools.Validators.InputNumberValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputNumberValidatorTest {

    @Test
    void validateRightNumbers() {
        boolean result = InputNumberValidator.validate(new char[]{'1', '2'},"2");
        assertTrue(result);
    }

    @Test
    void validateFalseNumbers() {
        boolean result = InputNumberValidator.validate(new char[]{'1', '2'},"a");
        assertFalse(result);
    }
}