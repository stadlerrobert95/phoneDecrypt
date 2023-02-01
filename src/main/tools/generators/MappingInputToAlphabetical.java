package main.tools.generators;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MappingInputToAlphabetical {
    public static List<List<Character>> convertInputNumberToAlphabetical(Map<Character, List<Character>> phoneDial, String input) {
        if(input.length() > 4){
            System.out.println("The input string is longer than expected (" + input.length() + " maximum: 4)");
            return null;
        }
        if(input.contains("1") || containsLetter(input)){
            System.out.println("The input string is contains invalid character (" + input + " allowed: digits only between 2-9)");
            return null;
        }
        List<List<Character>> inputToCharList = new ArrayList<>();

        for (char c : input.toCharArray()
        ) {
            inputToCharList.add(phoneDial.get(c));
        }
        return inputToCharList;
    }

    public static boolean containsLetter(String string) {
        for (char c : string.toCharArray()) {
            if (Character.isLetter(c)) {
                return true;
            }
        }
        return false;
    }
}