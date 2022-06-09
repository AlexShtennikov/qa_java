package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionTestWithParam {

    Feline feline;
    private final String sex;
    private final boolean expectedValue;

    public LionTestWithParam(String sex, boolean expectedValue) {
        this.sex = sex;
        this.expectedValue = expectedValue;
    }

    @Parameterized.Parameters
    public static Object[][] getHaveManeData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void doesHaveMane_shouldReturnCorrectBoolean() throws Exception {
        Lion lion = new Lion(sex, feline);
        boolean actualResult = lion.doesHaveMane();
        assertEquals(expectedValue, actualResult);
    }

}
