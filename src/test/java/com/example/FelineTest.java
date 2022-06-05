package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void eatMeat() throws Exception {
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        List<String> actualResult = feline.eatMeat();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getFamily() {
        String expectedResult = "Кошачьи";
        String actualResult = feline.getFamily();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getKittens() {
        int expectedResult = 1;
        int actualResult = feline.getKittens();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGetKittens() {
        int expectedResult = 1;
        int actualResult = feline.getKittens(1);
        assertEquals(expectedResult, actualResult);
    }
}