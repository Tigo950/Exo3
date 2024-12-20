package com.controle.tdd.test;

import com.controle.tdd.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void testFizzBuzzDe1() {
        assertEquals("1", FizzBuzz.de(1));
    }
}
