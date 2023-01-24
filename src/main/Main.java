package main;

import main.Tools.Generators.GenerateAllCombinations;
import main.Tools.Generators.MappingInputToAlphabetical;
import main.Tools.Generators.PhoneDialMapper;
import main.Tools.Validators.InputValidator;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<Character, List<Character>> phoneDial;

        //Get the input parameter from console
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

        GenerateAllCombinations allCombinations = new GenerateAllCombinations();
        List<String> result = allCombinations.generate(inputToCharList,  0, "");

        allCombinations.print(result);

        //Sort via Collections.sort()
        System.out.println("Collections.sort() Sort:");
        List<String> list = allCombinations.sortDefault(result);
        allCombinations.print(list);

        allCombinations.print(result);
        //Sort via Custom Sort algorithm
        System.out.println("Custom Sort:");
        result = allCombinations.sortCustom(result);
        allCombinations.print(result);

    }

}