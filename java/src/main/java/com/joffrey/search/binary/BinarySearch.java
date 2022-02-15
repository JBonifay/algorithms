package com.joffrey.search.binary;

public class BinarySearch {

    public int search(int[] input, int target) {
        // int low = 0 (because min index is 0)
        // int high is equals to the size of the array (-1 because we start from zero !)

            // While ( *condition )
            // * Condition to continue the loop:
            // low < high because of low = mid + 1;
            // low = high because of high = mid - 1;

                // We get the mid value => (low + high) / 2
                // and the current value => input[mid]

                // if current value == target
                    // return mid value
                // else if current value > target
                    // set high to mid - 1 (-1 because we don't want to include the actual mid value in next turn !)
                // else (if current value < target
                    // set low to mid + 1 (+1 because we do not want to include mid value in next turn !)

        // return -1 because we did not found target
        return -1;
    }

}
