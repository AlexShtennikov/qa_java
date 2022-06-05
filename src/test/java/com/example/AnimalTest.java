package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class AnimalTest {

    Animal animal = new Animal();
    private final String currentValue;
    private final List<String> expectedValue;

    public AnimalTest(String currentValue, List<String> expectedValue) {
        this.currentValue = currentValue;
        this.expectedValue = expectedValue;
    }

    @Parameterized.Parameters
    public static Object[][] getFoodData() {
        return new Object[][] {
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
                //{"ТестПустогоЗначения", "Неизвестный вид животного, используйте значение Травоядное или Хищник" },
        };
    }


    @Test
    public void getFood() throws Exception {
        List<String> actualResult = animal.getFood(currentValue);
        assertEquals(expectedValue, actualResult);
        }

    @Test
    public void getFamily() {
        String expectedResult = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actualResult = animal.getFamily();
        assertEquals(expectedResult, actualResult);
    }
}