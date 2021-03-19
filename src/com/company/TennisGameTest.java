package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TennisGameTest {
    @Test
    public void test0_0(){
        TennisGame tennisGame = new TennisGame();
        Assertions.assertEquals("0-0",tennisGame.score());

    }

    @Test
    public void test15_0(){
        TennisGame tennisGame = new TennisGame();
        tennisGame.firstPlayerScore();
        Assertions.assertEquals("15-0",tennisGame.score());

    }

    @Test
    public void test30_0(){
        TennisGame tennisGame = new TennisGame();
        tennisGame.firstPlayerScore();
        tennisGame.firstPlayerScore();
        Assertions.assertEquals("30-0",tennisGame.score());

    }

    @Test
    public void test40_0(){
        TennisGame tennisGame = new TennisGame();
        tennisGame.firstPlayerScore();
        tennisGame.firstPlayerScore();
        tennisGame.firstPlayerScore();
        Assertions.assertEquals("40-0",tennisGame.score());

    }
    @Test
    public void testWin_0(){
        TennisGame tennisGame = new TennisGame();
        tennisGame.firstPlayerScore();
        tennisGame.firstPlayerScore();
        tennisGame.firstPlayerScore();
        tennisGame.firstPlayerScore();
        Assertions.assertEquals("Win game",tennisGame.score());

    }
}
