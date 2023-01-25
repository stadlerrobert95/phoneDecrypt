package main.Tools.Generators;

import java.util.*;

public class GenerateAllCombinations {
    List<String> result = new ArrayList<>();
    /**
     * Recursive generator of possible combinations
     *
     * @param inputLists list of lists with possible characters for numbers
     * @param depth      in which list is the function is
     * @param current    the base string for combination
     */
    public List<String> generate(List<List<Character>> inputLists, int depth, String current) {
        if (depth == inputLists.size()) {
            result.add(current);
            return result;
        }
        for (int i = 0; i < inputLists.get(depth).size(); i++) {
            generate(inputLists,  depth + 1, current + inputLists.get(depth).get(i));
        }
        return result;
    }

    public void print(List<String> list ){
        String lastItem = list.get(list.size() - 1);
        for (String item: list){
            if (item.equals(lastItem)){
                System.out.print("[" + item + "]\n");
                return;
            }
            System.out.print("[" + item + "], ");
        }
    }

    public List<String> sortCustom(List<String> list) {
        String[] array = list.toArray(new String[0]);
        int size = array.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i].compareToIgnoreCase(array[j]) > 0) {
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return Arrays.stream(array).toList();
    }

    public List<String> sortDefault(List<String> list){
        List<String> stringList = new ArrayList<>(list);
        Collections.sort(stringList);
        return stringList;
    }
}