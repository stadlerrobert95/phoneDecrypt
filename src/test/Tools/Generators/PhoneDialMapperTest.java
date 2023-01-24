package test.Tools.Generators;

import main.Tools.Generators.PhoneDialMapper;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class PhoneDialMapperTest {

    Map<Character, List<Character>> phoneDial;
    List<Character> expected;

    @BeforeEach
    void init() {
        phoneDial = PhoneDialMapper.generate();
        expected = new ArrayList<>();
    }

    @AfterEach
    void teardown(){
        expected.clear();
    }

    @Test
    void generateTwo() {
        List<Character> actual = phoneDial.get('2');
        expected.add('a');
        expected.add('c');
        expected.add('b');
        assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }
    @Test
    void generateThree() {
        List<Character> actual = phoneDial.get('3');
        expected.add('d');
        expected.add('e');
        expected.add('f');
        assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }
    @Test
    void generateFour() {
        List<Character> actual = phoneDial.get('4');
        expected.add('g');
        expected.add('h');
        expected.add('i');
        assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }
    @Test
    void generateFive() {
        List<Character> actual = phoneDial.get('5');
        expected.add('j');
        expected.add('k');
        expected.add('l');
        assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }
    @Test
    void generateSix() {
        List<Character> actual = phoneDial.get('6');
        expected.add('m');
        expected.add('n');
        expected.add('o');
        assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }
    @Test
    void generateSeven() {
        List<Character> actual = phoneDial.get('7');
        expected.add('p');
        expected.add('q');
        expected.add('r');
        expected.add('s');
        assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }
    @Test
    void generateEight() {
        List<Character> actual = phoneDial.get('8');
        expected.add('t');
        expected.add('u');
        expected.add('v');
        assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }
    @Test
    void generateNine() {
        List<Character> actual = phoneDial.get('9');
        expected.add('w');
        expected.add('x');
        expected.add('y');
        expected.add('z');
        assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }


}