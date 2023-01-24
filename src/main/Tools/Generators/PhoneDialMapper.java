package main.Tools.Generators;

import java.util.*;

public class PhoneDialMapper {
    //TODO same as '2'

    public static Map<Character, List<Character>> generate() {

        Map<Character, List<Character>> phoneDial = new HashMap<>();

        phoneDial.put('2', Arrays.asList('a', 'b', 'c'));
        phoneDial.put('3', Arrays.asList('d', 'e', 'f'));
        phoneDial.put('4', Arrays.asList('g', 'h', 'i'));
        phoneDial.put('5', Arrays.asList('j', 'k', 'l'));
        phoneDial.put('6', Arrays.asList('m', 'n', 'o'));
        phoneDial.put('7', Arrays.asList('p', 'q', 'r', 's'));
        phoneDial.put('8', Arrays.asList('t', 'u', 'v'));
        phoneDial.put('9', Arrays.asList('w', 'x', 'y', 'z'));

        return phoneDial;
    }
}