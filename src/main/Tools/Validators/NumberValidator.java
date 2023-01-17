package main.Tools.Validators;

public class NumberValidator {
    /**
     * Checks the input string is only contains numbers
     *
     * @param input input string to be checked
     */
    public static void validate(String input) {
        try {
            Integer.parseInt(input);
        //    System.out.println("Input is a number: " + input);
        } catch (NumberFormatException e) {
        //    System.out.println("Input is not number: " + input);
        }
    }
}