package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author abhishek
 */

public class TennisGameTest {

    TennisGame tennisGame = new TennisGame();

    @Test
    public void test0_0() {
        resultAssert("0-0");

    }

    @Test
    public void test15_0() {
        playerScore(1);
        resultAssert("15-0");

    }

    @Test
    public void test30_0() {
        playerScore(2);
        resultAssert("30-0");
        ;

    }

    @Test
    public void test40_0() {
        playerScore(3);
        resultAssert("40-0");

    }

    @Test
    public void testWin_0() {
        playerScore(4);
        resultAssert("Win game");
    }

    private void resultAssert(String expectedResults) {
        Assertions.assertEquals(expectedResults, tennisGame.score());
    }

    private void playerScore(int scores) {
        for (int i = 0; i < scores; i++) {
            tennisGame.firstPlayerScore();
        }
    }
}
