package Tools.Validators;

public class LenghtValidator {
    /**
     * Checks the input string lenght is in the prerequied range of lenght
     *
     * @param min_lenght requiered minimum lenght of the input string
     * @param max_lenght requiered maximum lenght of the input string
     * @param input      input string to be checked
     */
    public static void validate(int min_lenght, int max_lenght, String input) {
        if (!(min_lenght <= input.length() && input.length() <= max_lenght)) {
            System.out.println("Invalid input lenght (must between 0 and 4): given " + input.length());
            System.out.println("Program terminated.");
            System.exit(0);
        }
    }
}