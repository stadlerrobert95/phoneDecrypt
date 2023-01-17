package main.Tools.Generators;

import java.util.ArrayList;
import java.util.List;

public class GenerateAllCombinations {
    /**
     * Recursive generator of possible combinations
     *
     * @param inputLists list of lists with possible characters for numbers
     * @param result     variable for the result of recursive function
     * @param depth      in which list is the function is
     * @param current    the base string for combination
     */
    public static void generate(List<ArrayList<Character>> inputLists, List<String> result, int depth, String current) {
        if (depth == inputLists.size()) {
            result.add(current);
            return;
        }

        for (int i = 0; i < inputLists.get(depth).size(); i++) {
            generate(inputLists, result, depth + 1, current + inputLists.get(depth).get(i));
        }
    }
}