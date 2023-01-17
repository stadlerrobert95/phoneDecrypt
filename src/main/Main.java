package main;

import main.Tools.Generators.GenerateAllCombinations;
import main.Tools.Generators.PhoneDialGenetator;
import main.Tools.Generators.SortByStringValue;
import main.Tools.Validators.InputNumberValidator;
import main.Tools.Validators.LenghtValidator;
import main.Tools.Validators.NumberValidator;

import java.util.*;

import static main.Tools.Constants.*;

public class Main {
    public static void main(String[] args) {

        Map<Character, ArrayList<Character>> phoneDial = new HashMap<>();

        //Get the input parameter from console
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        //Check the inputs length if it's not the required, the program stops
        LenghtValidator.validate(MIN_LENGHT, MAX_LENGHT, input);

        //Check the input, if it's not a number, the program stops
        NumberValidator.validate(input);

        //Check the input, looking for invalid numbers (0, 1)
        InputNumberValidator.validate(DIGITS, input);

        //Generating the basic Phone dial to a Map
        PhoneDialGenetator.generate(DIGITS, phoneDial);

        //Fill list with possible character variants for each number in the input
        List<ArrayList<Character>> inputToCharList = new ArrayList<>();

        for (char c: input.toCharArray()
             ) {
            inputToCharList.add(phoneDial.get(c));
        }

        //Initialise result list for combinations
        List<String> result = new ArrayList<>();

        GenerateAllCombinations.generate(inputToCharList, result, 0, "");

        System.out.println(SortByStringValue.sort(result));
    }

}