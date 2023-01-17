package main.Tools.Validators;

public class InputNumberValidator {
    /**
     * Check if the input string is in the range of digits strings
     *
     * @param digits possible numbers as strings
     * @param input  input numbers as string to be checked
     */
    public static boolean validate(char[] digits, String input) {
        boolean contains = false;
        for (char c : input.toCharArray()) {
            if (contains) {
                contains = false;
            }

            for (char element : digits) {
                if (element == c) {
                    contains = true;
                    break;
                }
            }
            if (!contains) {
                break;
            }
        }
        return contains;
        //System.out.println(contains);
    }
}