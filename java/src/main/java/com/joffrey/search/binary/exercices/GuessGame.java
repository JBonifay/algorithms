package com.joffrey.search.binary.exercices;

/**
 * We are playing the Guess Game. The game is as follows:
 * <p>
 * I pick a number from 1 to n. You have to guess which number I picked.
 * <p>
 * Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.
 * <p>
 * You call a pre-defined API int guess(int num), which returns three possible results:
 * <p>
 * -1: Your guess is higher than the number I picked (i.e. num > pick).
 * 1: Your guess is lower than the number I picked (i.e. num < pick).
 * 0: your guess is equal to the number I picked (i.e. num == pick).
 * <p>
 * Return the number that I picked
 */
public class GuessGame {

    private final int chosenNumber;

    public GuessGame(int chosenNumber) {
        this.chosenNumber = chosenNumber;
    }

    public int guessNumber(int totalNumbers) {
        // int low = 1 ( Exercise say it's a number from 1 to totalNumbers)
        // int high is equals to totalNumbers

        // while ( *condition )
        // low < to high because we will up low value while searching
        // low == to high because if low = 4 and high = 4

            // int mid is equals to: low + ( high - low ) / 2
            // int guess will say us if we are under, upper or equals to what we are looking for
            // int guess = guess(mid);

            // if guess == 0, we found it !
                // return mid
            // else if guess equals -1 ( means that the target is under our proposal )
                // set high value to mid - 1 ( -1 because we don't want to include previous value )
            // else ( it means that the target is upper our proposal !)
                // low = mid + 1 (+1 because we don't want to include previous value)

        // we found nothing !
        return -1;
    }

    /**
     * This method will return a value indicating if the proposal is
     * upper, lower, or equals to the number chosen
     *
     * @param proposal the number proposed
     * @return -1 if proposal > chooseNumber
     *          1 if proposal < chooseNumber
     *          0 if proposal == chooseNumber
     */
    private int guess(int proposal) {
        if (proposal == chosenNumber) {
            return 0;
        } else if (proposal > chosenNumber) {
            return -1;
        } else {
            return +1;
        }
    }

}
