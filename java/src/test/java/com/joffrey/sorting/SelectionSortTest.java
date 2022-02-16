package com.joffrey.sorting;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SelectionSortTest {

    @Test
    void sortArray() {
        SelectionSort selectionSort = new SelectionSort();
        ArrayList<Integer> input = new ArrayList<>() {{
            add(4);
            add(3);
            add(2);
            add(1);
        }};
        assertEquals(List.of(1, 2, 3, 4), selectionSort.selectionSort(input));
    }


}
