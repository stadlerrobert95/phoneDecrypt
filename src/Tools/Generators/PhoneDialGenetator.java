package Tools.Generators;

import java.util.ArrayList;
import java.util.Map;

public class PhoneDialGenetator {

    public static void generate(char[] digits, Map<Character, ArrayList<Character>> phoneDial) {
        phoneDial.put(digits[0], new ArrayList<>());
        phoneDial.get('2').add('a');
        phoneDial.get('2').add('b');
        phoneDial.get('2').add('c');
        phoneDial.put(digits[1], new ArrayList<>());
        phoneDial.get('3').add('d');
        phoneDial.get('3').add('e');
        phoneDial.get('3').add('f');
        phoneDial.put(digits[2], new ArrayList<>());
        phoneDial.get('4').add('g');
        phoneDial.get('4').add('h');
        phoneDial.get('4').add('i');
        phoneDial.put(digits[3], new ArrayList<>());
        phoneDial.get('5').add('j');
        phoneDial.get('5').add('k');
        phoneDial.get('5').add('l');
        phoneDial.put(digits[4], new ArrayList<>());
        phoneDial.get('6').add('m');
        phoneDial.get('6').add('n');
        phoneDial.get('6').add('o');
        phoneDial.put(digits[5], new ArrayList<>());
        phoneDial.get('7').add('p');
        phoneDial.get('7').add('q');
        phoneDial.get('7').add('r');
        phoneDial.get('7').add('s');
        phoneDial.put(digits[6], new ArrayList<>());
        phoneDial.get('8').add('t');
        phoneDial.get('8').add('u');
        phoneDial.get('8').add('v');
        phoneDial.put(digits[7], new ArrayList<>());
        phoneDial.get('9').add('w');
        phoneDial.get('9').add('x');
        phoneDial.get('9').add('y');
        phoneDial.get('9').add('z');
    }
}