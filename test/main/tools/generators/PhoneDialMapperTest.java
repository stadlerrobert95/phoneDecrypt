package main.tools.generators;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static main.tools.generators.PhoneDialMapper.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PhoneDialMapperTest{

    private Map<Character, List<Character>> phoneDial;
    private List<Character> expected;

    @BeforeEach
    void init() {
        phoneDial = generate();
        expected = new ArrayList<>();
    }

    @AfterEach
    void teardown(){
        expected.clear();
    }

    @Test
    void generateTwo() {
        List<Character> actual = phoneDial.get('2');
        Collections.addAll(expected, 'a', 'b', 'c');
        assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }
    @Test
    void generateThree() {
        List<Character> actual = phoneDial.get('3');
        Collections.addAll(expected, 'd', 'e', 'f');
        assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }
    @Test
    void generateFour() {
        List<Character> actual = phoneDial.get('4');
        Collections.addAll(expected, 'g', 'h', 'i');
        assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }
    @Test
    void generateFive() {
        List<Character> actual = phoneDial.get('5');
        Collections.addAll(expected, 'j', 'k', 'l');
        assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }
    @Test
    void generateSix() {
        List<Character> actual = phoneDial.get('6');
        Collections.addAll(expected, 'm', 'n', 'o');
        assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }
    @Test
    void generateSeven() {
        List<Character> actual = phoneDial.get('7');
        Collections.addAll(expected, 'p', 'q', 'r', 's');
        assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }
    @Test
    void generateEight() {
        List<Character> actual = phoneDial.get('8');
        Collections.addAll(expected, 't', 'u', 'v');
        assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }
    @Test
    void generateNine() {
        List<Character> actual = phoneDial.get('9');
        Collections.addAll(expected, 'w', 'x', 'y', 'z');
        assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }


}