package main;

import main.Tools.Exceptions.InvalidInputException;
import main.Tools.Generators.GenerateAllCombinations;
import main.Tools.Generators.PhoneDialMapper;
import main.Tools.Validators.InputValidator;

import java.util.*;

public class Main {
    public static void main(String[] args) throws InvalidInputException {

        Map<Character, List<Character>> phoneDial;

        //Get the input parameter from console
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        //Validate input with regex
        InputValidator validate = new InputValidator();
        if (!validate.validate(input))
            throw new InvalidInputException("Exception: Invalid input: \"" + input + "\" should be a zero to four length, and digits between 2-9");

        //TODO void -> Map<>
        //Generating the basic Phone dial to a Map
        phoneDial = PhoneDialMapper.generate();

        //Fill list with possible character variants for each number in the input
        List<List<Character>> inputToCharList = new ArrayList<>();

        for (char c: input.toCharArray()
             ) {
            inputToCharList.add(phoneDial.get(c));
        }

        //Initialise result list for combinations
        List<String> result = new ArrayList<>();

        GenerateAllCombinations.generate(inputToCharList, result, 0, "");

        //List<String> result2 = GenerateAllCombinations.generateList(phoneDial,input);

        //Collections.sort(result2);
        //System.out.println(result2);

        //todo Implement sorting algorithm
        System.out.println(result);
        Collections.sort(result);

    }

}