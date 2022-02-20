package com.joffrey.search.binary.exercices;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessGameTest {

    private GuessGame guessGame;

    @Test
    void return6For10Numbers() {
        GuessGame guessGame = new GuessGame(6);
        assertEquals(6, guessGame.guessNumber(10));
    }

    @Test
    void return1For1Number() {
        guessGame = new GuessGame(1);
        assertEquals(1, guessGame.guessNumber(1));
    }

    @Test
    void return1For2Numbers() {
        guessGame = new GuessGame(1);
        assertEquals(1, guessGame.guessNumber(2));
    }
}
