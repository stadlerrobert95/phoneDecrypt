package main.Tools.Generators;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MappingInputToAlphabetical {
    public static List<List<Character>> convertInputNumberToAlphabetical(Map<Character, List<Character>> phoneDial, String input) {
        List<List<Character>> inputToCharList = new ArrayList<>();

        for (char c : input.toCharArray()
        ) {
            inputToCharList.add(phoneDial.get(c));
        }
        return inputToCharList;
    }
}