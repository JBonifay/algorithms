package com.joffrey.search.binary.exercices;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RotatedSortedArrayTest {

    private RotatedSortedArray rsa;

    @BeforeEach
    void setUp() {
        rsa = new RotatedSortedArray();
    }

    @Test
    void exampleOne() {
        assertEquals(4, rsa.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
    }

    @Test
    void exampleTwo() {
        assertEquals(-1, rsa.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));
    }
}
