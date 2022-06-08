package com.example;


import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FelineTest {

    @Test
    public void eatMeat_NoArgs_ShouldReturnExpectedValue() throws Exception {
        Feline feline = new Feline();
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        List<String> actualResult = feline.eatMeat();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getFamily_NoArgs_ShouldReturnExpectedValue() {
        Feline feline = new Feline();
        String expectedResult = "Кошачьи";
        String actualResult = feline.getFamily();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getKittens_NoArgs_ShouldReturnNum1() {
        Feline feline = new Feline();
        int expectedResult = 1;
        int actualResult = feline.getKittens();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getKittens_Arg1_ShouldReturnNum1() {
        Feline feline = new Feline();
        int expectedResult = 1;
        int actualResult = feline.getKittens(1);
        assertEquals(expectedResult, actualResult);
    }
}