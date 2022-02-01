package com.joffrey;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTest {

    private BinarySearch bs;

    @BeforeEach
    void setUp() {
        bs = new BinarySearch();
    }

    @Test
    void returnMinus1WhenTargetIsNotInArray() {
        assertEquals(-1, bs.search(new int[]{1, 3, 5, 7, 9}, 10));
    }

    @Test
    void return1WhenTargetIs3AndIsAtIndex1() {
        assertEquals(1, bs.search(new int[]{1, 3, 5, 7, 9}, 3));
    }

}
