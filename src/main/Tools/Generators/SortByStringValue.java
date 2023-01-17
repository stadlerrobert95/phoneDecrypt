package main.Tools.Generators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortByStringValue {
    public static List<String> sort(List<String> list) {
        Map<String, Integer> unsorted = new HashMap<String, Integer>();
        for (String string : list
        ) {
            char[] chars = string.toCharArray();
            int sum = 0;
            for (char c : chars) {
                sum += Character.getNumericValue(c);
            }
            unsorted.put(string, sum);
        }

        List<String> sorted = new ArrayList<String>();
        List<Map.Entry<String, Integer>> list2 = new ArrayList<Map.Entry<String, Integer>>(unsorted.entrySet());
        list2.sort(Map.Entry.comparingByValue());
        for (Map.Entry<String, Integer> item : list2
        ) {
            sorted.add(item.getKey());
        }

        return sorted;
    }
}