package main.tools.generators;

import java.util.*;

public class GenerateAllCombinations {
    static List<String> result = new ArrayList<>();
    /**
     * Recursive generator of possible combinations
     *
     * @param inputLists list of lists with possible characters for numbers
     * @param depth      in which list is the function is
     * @param current    the base string for combination
     */
    public static List<String> generate(List<List<Character>> inputLists, int depth, String current) {
        if (depth == inputLists.size()) {
            result.add(current);
            return result;
        }
        for (int i = 0; i < inputLists.get(depth).size(); i++) {
            generate(inputLists,  depth + 1, current + inputLists.get(depth).get(i));
        }
        return result;
    }

    public static void print(){
        String lastItem = result.get(result.size() - 1);
        for (String item: result){
            if (item.equals(lastItem)){
                System.out.print("[" + item + "]\n");
                return;
            }
            System.out.print("[" + item + "], ");
        }
    }

    public static void sortCustom() {
        int size = result.size();
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (result.get(i).compareToIgnoreCase(result.get(j)) > 0) {
                    String temp = result.get(i);
                    result.set(i, result.get(j));
                    result.set(j, temp);
                }
            }
        }

    }
    public static void sortDefault(){

        Collections.sort(result);
    }
}