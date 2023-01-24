package test.Tools.Generators;

import main.Tools.Generators.MappingInputToAlphabetical;
import main.Tools.Generators.PhoneDialMapper;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class MappingInputToAlphabeticalTest extends MappingInputToAlphabetical {
    Map<Character, List<Character>> listMap;
    List<List<Character>> result;
    List<List<Character>> excepted;
    List<Character> exceptedFillerList;
    String input;

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
    void convertInputNumber_OneLenght_ToAlphabetical() {
        input = "2";
        result = convertInputNumberToAlphabetical(listMap, input);

        Collections.addAll(exceptedFillerList, 'a', 'b', 'c');
        excepted.add(exceptedFillerList.stream().toList());

        System.out.println("Excepted: " + excepted);
        System.out.println("Result:   " + result);

        assertTrue(result.containsAll(excepted));

    }

    @Test
    void convertInputNumber_TwoLenght_ToAlphabetical() {
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
    void convertInputNumber_ThreeLenght_ToAlphabetical(){
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
    void convertInputNumber_FourLenght_ToAlphabetical(){
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
    void convertInputNumber_FiveLenght_ToAlphabetical(){
        input = "23456";
        result = convertInputNumberToAlphabetical(listMap, input);

        System.out.println("Excepted: " + excepted);
        System.out.println("Result:   " + result);

        assertNull(result);
    }

    @Test
    void convertInputNumber_ContainsNumber1_ToAlphabetical(){
        input = "2316";
        result = convertInputNumberToAlphabetical(listMap, input);

        System.out.println("Excepted: " + excepted);
        System.out.println("Result:   " + result);

        assertNull(result);
    }

    @Test
    void convertInputNumber_ContainsLetters_ToAlphabetical(){
        input = "23l6";
        result = convertInputNumberToAlphabetical(listMap, input);

        System.out.println("Excepted: " + excepted);
        System.out.println("Result:   " + result);

        assertNull(result);
    }
}