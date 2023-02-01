package main.tools.generators;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GenerateAllCombinationsTest extends GenerateAllCombinations {
    private List<List<Character>> list;
    private List<String> result;
    private List<Character> characterList;
    private Character[] chars;
    private final PrintStream printStream = System.out;

    @BeforeEach
    void setUp() {
        list = new ArrayList<>();
    }

    @AfterEach
    void tearDown() {
        System.setOut(printStream);
        GenerateAllCombinations.result.clear();
    }

    @Test
    void testGenerateSingle() {
        chars = new Character[]{'a', 'b', 'c'};
        characterList = new ArrayList<>(List.of(chars));
        list.add(characterList);
        result = GenerateAllCombinations.generate(list,0,"");
        List<String> expected = new ArrayList<>(List.of("a", "b", "c"));
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + result);
        assertTrue(result.containsAll(expected));
    }


    @Test
    void testGenerateDouble() {
        chars = new Character[]{'a', 'b', 'c'};
        characterList = new ArrayList<>(List.of(chars));
        list.add(characterList);
        list.add(characterList);
        result = GenerateAllCombinations.generate(list,0,"");
        List<String> expected = new ArrayList<>(List.of("aa", "ab", "ac", "ba", "bb", "bc", "ca", "cb", "cc"));
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + result);
        assertTrue(result.containsAll(expected));
    }

    @Test
    void testPrint() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        chars = new Character[]{'a', 'b', 'c'};
        characterList = new ArrayList<>(List.of(chars));
        list.add(characterList);
        result = GenerateAllCombinations.generate(list, 0, "");
        GenerateAllCombinations.print();
        assertEquals("[a], [b], [c]" ,outputStream.toString().trim());
    }

    @Test
    void testSortCustom() {
        String[] elements = {"aa", "bb", "ad", "ac"};
        List<String> part = new ArrayList<>(Arrays.asList(elements));
        List<String> actual = new ArrayList<>(part);
        List<String> expected = new ArrayList<>();
        Collections.addAll(expected, "aa", "ac", "ad", "bb");
        GenerateAllCombinations.result = actual;
        GenerateAllCombinations.sortCustom();
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + actual);
        assertEquals(expected, actual);
    }

    @Test
    void testSortDefault() {
        String[] elements = {"aa", "bb", "ad", "ac"};
        List<String> actual = new ArrayList<>(Arrays.asList(elements));
        List<String> expected = new ArrayList<>();
        Collections.addAll(expected, "aa", "ac", "ad", "bb");
        GenerateAllCombinations.result = actual;
        GenerateAllCombinations.sortDefault();
        System.out.println("Expected: " + expected);
        System.out.println("Actual:   " + actual);
        assertEquals(expected, actual);
    }
}