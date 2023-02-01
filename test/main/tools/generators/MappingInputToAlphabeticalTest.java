package main.tools.generators;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static main.tools.generators.MappingInputToAlphabetical.convertInputNumberToAlphabetical;
import static org.junit.jupiter.api.Assertions.*;

class MappingInputToAlphabeticalTest {
    private Map<Character, List<Character>> listMap;
    private List<List<Character>> result;
    private List<List<Character>> excepted;
    private List<Character> exceptedFillerList;
    private String input;

    @BeforeEach
    void setUp() {
        listMap = PhoneDialMapper.generate();
        excepted = new ArrayList<>();
        exceptedFillerList = new ArrayList<>();
    }

    @AfterEach
    void tearDown() {
        exceptedFillerList.clear();
    }

    @Test
    void convertInputNumber_ZeroLength_ToAlphabetical(){
        input = "";
        result = convertInputNumberToAlphabetical(listMap, input);

        System.out.println("Excepted: " + excepted);
        System.out.println("Result:   " + result);

        assertTrue(result.containsAll(excepted));
    }

    @Test
    void convertInputNumber_OneLength_ToAlphabetical() {
        input = "2";
        result = convertInputNumberToAlphabetical(listMap, input);

        Collections.addAll(exceptedFillerList, 'a', 'b', 'c');
        excepted.add(exceptedFillerList.stream().toList());

        System.out.println("Excepted: " + excepted);
        System.out.println("Result:   " + result);

        assertTrue(result.containsAll(excepted));

    }

    @Test
    void convertInputNumber_TwoLength_ToAlphabetical() {
        input = "23";
        result = convertInputNumberToAlphabetical(listMap, input);

        Collections.addAll(exceptedFillerList, 'a', 'b', 'c');
        excepted.add(exceptedFillerList.stream().toList());
        exceptedFillerList.clear();

        Collections.addAll(exceptedFillerList, 'd', 'e', 'f');
        excepted.add(exceptedFillerList.stream().toList());

        System.out.println("Excepted: " + excepted);
        System.out.println("Result:   " + result);

        assertTrue(result.containsAll(excepted));

    }

    @Test
    void convertInputNumber_ThreeLength_ToAlphabetical(){
        input = "234";
        result = convertInputNumberToAlphabetical(listMap, input);

        Collections.addAll(exceptedFillerList, 'a', 'b', 'c');
        excepted.add(exceptedFillerList.stream().toList());
        exceptedFillerList.clear();

        Collections.addAll(exceptedFillerList, 'd', 'e', 'f');
        excepted.add(exceptedFillerList.stream().toList());
        exceptedFillerList.clear();

        Collections.addAll(exceptedFillerList, 'g', 'h', 'i');
        excepted.add(exceptedFillerList.stream().toList());

        System.out.println("Excepted: " + excepted);
        System.out.println("Result:   " + result);

        assertTrue(result.containsAll(excepted));
    }

    @Test
    void convertInputNumber_FourLength_ToAlphabetical(){
        input = "2345";
        result = convertInputNumberToAlphabetical(listMap, input);
        Collections.addAll(exceptedFillerList, 'a', 'b', 'c');
        excepted.add(exceptedFillerList.stream().toList());
        exceptedFillerList.clear();

        Collections.addAll(exceptedFillerList, 'd', 'e', 'f');
        excepted.add(exceptedFillerList.stream().toList());
        exceptedFillerList.clear();

        Collections.addAll(exceptedFillerList, 'g', 'h', 'i');
        excepted.add(exceptedFillerList.stream().toList());
        exceptedFillerList.clear();

        Collections.addAll(exceptedFillerList, 'j', 'k', 'l');
        excepted.add(exceptedFillerList.stream().toList());

        System.out.println("Excepted: " + excepted);
        System.out.println("Result:   " + result);

        assertTrue(result.containsAll(excepted));
    }

    @Test
    void convertInputNumber_FiveLength_ToAlphabetical(){
        input = "23456";
        result = convertInputNumberToAlphabetical(listMap, input);

        System.out.println("Excepted: " + "Result size is 5 lenght");
        System.out.println("Result:   " + "Result size: " + result.size());
        assertEquals(5, result.size());
    }

    @Test
    void convertInputNumber_ContainsNumber1_ToAlphabetical(){
        input = "2316";
        result = convertInputNumberToAlphabetical(listMap, input);

        System.out.println("Excepted: " + (result.contains(null)?"Result set contains null":""));
        System.out.println("Result:   " + result);

        assertTrue(result.contains(null));
    }

    @Test
    void convertInputNumber_ContainsLetters_ToAlphabetical(){
        input = "23l6";
        result = convertInputNumberToAlphabetical(listMap, input);

        System.out.println("Excepted: " + (result.contains(null)?"Result set contains null":""));
        System.out.println("Result:   " + result);

        assertTrue(result.contains(null));
    }
}