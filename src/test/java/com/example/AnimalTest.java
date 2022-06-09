package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {


    @Test
    public void getFood_UnknownAnimal_ThrowException() {

        Animal animal = new Animal();

        Exception exception = null;
        try {
            animal.getFood(null);
        } catch (Exception ex) {
            exception = ex;
        }

        boolean expectedValue = true;
        assertEquals(expectedValue, exception != null);

        String expectedResult = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
        assertEquals(expectedResult, exception.getMessage());
    }

    @Test
    public void getFamily_ShouldReturnСorrectString() {

        Animal animal = new Animal();
        String expectedResult = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actualResult = animal.getFamily();
        assertEquals(expectedResult, actualResult);
    }
}