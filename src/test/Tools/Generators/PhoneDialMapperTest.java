package test.Tools.Generators;

import main.Tools.Generators.PhoneDialMapper;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class PhoneDialMapperTest {
    char[] digits = {'2', '3', '4', '5', '6', '7', '8', '9'};
    Map<Character, ArrayList<Character>> phoneDial = new HashMap<>();

    @Test
    void generateRight() {
        PhoneDialMapper.generate();
        List<Character> expected = new ArrayList<>();
        List<Character> actual = phoneDial.get('2');
        expected.add('a');
        expected.add('b');
        expected.add('c');
        assertEquals(actual,expected);
    }

}