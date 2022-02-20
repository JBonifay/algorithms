package com.joffrey.search.binary.exercices;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SqrtTest {

    @Test
    void return1For1() {
        assertEquals(1, Sqrt.of(1));
    }

    @Test
    void return2For4() {
        assertEquals(2, Sqrt.of(4));
    }

    @Test
    void returnMinus1ForIncorrect() {
        assertEquals(-1, Sqrt.of(13));
    }

}
