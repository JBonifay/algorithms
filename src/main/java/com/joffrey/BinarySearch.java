package com.joffrey;

public class BinarySearch {

    public int search(int[] input, int target) {
        int low = 0;
        int high = input.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int curr = input[mid];
            if (curr == target) {
                return mid;
            } else if (curr > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

}
