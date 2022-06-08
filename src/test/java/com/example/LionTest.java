package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

//@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    //@Mock
    Feline feline = new Feline();

    @Test
    public void shouldBeCorrectMessageOfException() {

        Exception exception = null;
        try {
            Lion lion = new Lion(null, feline);
        } catch (Exception ex) {
            exception = ex;
        }

        String expectedResult = "Используйте допустимые значения пола животного - самей или самка";
        assertEquals(expectedResult, exception.getMessage());
    }

    @Test
    public void shouldBeCorrectNum() throws Exception {

        Lion lion = new Lion("Самец", feline);

        int expectedResult = 1;
        int actualResult = lion.getKittens();
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void shouldBackCorrectList() throws Exception {
        Lion lion = new Lion("Самка", feline);
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        List<String> actualResult = lion.getFood();
        assertEquals(expectedResult, actualResult);
    }
   }
