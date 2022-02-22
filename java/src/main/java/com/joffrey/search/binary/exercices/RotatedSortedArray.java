package com.joffrey.search.binary.exercices;

public class RotatedSortedArray {

    public int search(int[] nums, int target) {
        // int low is set to 0
        // int hih = nums.length -1 (-1 because we are 0 based !)

        // while ( * condition )
        // low < high because we will low = mid + 1
        // low = high because low can be equals to high
            // int midIdx is equals to (low + high) / 2

            // if nums[midIdx] equals target, we found it !
                // return midIdx

            // if nums[low] is <= to nums[mid], left part of the search space is sorted
                // if target >= nums[low] && target <= nums[mid]
                    // high = mid - 1
                // else
                    // low = mid + 1;
            // else, the right part of search space is sorted
                // if target >= nums[mid] && target <= nums[high]
                    // low = mid + 1;
                // else
                    // high = mid - 1;

        // We found nothing !
        return -1;
    }

}
