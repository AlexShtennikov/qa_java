package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

    @RunWith(Parameterized.class)
    public class AnimalTestWithParams {

        private final String currentValue;
        private final List<String> expectedValue;

        public AnimalTestWithParams(String currentValue, List<String> expectedValue) {
            this.currentValue = currentValue;
            this.expectedValue = expectedValue;
        }

        @Parameterized.Parameters
        public static Object[][] getFoodData() {
            return new Object[][] {
                    {"Травоядное", List.of("Трава", "Различные растения")},
                    {"Хищник", List.of("Животные", "Птицы", "Рыба")},
            };
        }

        @Test
        public void getFood_KnownArgs_ShouldReturnCorrectList() throws Exception {
            Animal animal = new Animal();
            List<String> actualResult = animal.getFood(currentValue);
            assertEquals(expectedValue, actualResult);
        }
    }

