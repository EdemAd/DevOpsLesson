package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicTest {

    @Test
    public void simpleAdditionTest() {
        int result = 2 + 2;
        assertEquals(4, result);
    }
}
