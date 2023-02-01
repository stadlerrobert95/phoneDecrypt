package main;

import main.tools.generators.GenerateAllCombinations;
import main.tools.generators.MappingInputToAlphabetical;
import main.tools.generators.PhoneDialMapper;
import main.tools.validators.InputValidator;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<Character, List<Character>> phoneDial;

        //Get the input parameter from console
        System.out.println("Enter maximum 4 length digit:");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        //Validate input with regex
        InputValidator validate = new InputValidator();
        if (!validate.validate(input)){
            System.out.println("Invalid input: \"" + input + "\" should be a zero to four length, and digits between 2-9");
            System.out.println("The application will shut down.");
            return;
        }

        //Generating the basic Phone dial to a Map
        phoneDial = PhoneDialMapper.generate();

        //Fill list with possible character variants for each number in the input
        //Ex.: 23 to [[a], [b], [c]], [[d], [e], [f]]
        List<List<Character>> inputToCharList = MappingInputToAlphabetical.convertInputNumberToAlphabetical(phoneDial, input);

        //GenerateAllCombinations allCombinations = new GenerateAllCombinations();
        List<String> result = GenerateAllCombinations.generate(inputToCharList,  0, "");
        GenerateAllCombinations.print();

        //Add random value for testing custom sorting algorithm
        result.add("aj");

        //Sort via Custom Sort algorithm
        System.out.println("Custom Sort:");
        GenerateAllCombinations.sortCustom();
        GenerateAllCombinations.print();

        //Add random value for testing default sorting algorithm
        result.add("ah");

        //Sort via Collections.sort()
        System.out.println("Collections.sort() Sort:");
        GenerateAllCombinations.sortDefault();
        GenerateAllCombinations.print();



    }

}