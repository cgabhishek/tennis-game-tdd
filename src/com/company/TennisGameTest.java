package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TennisGameTest {
    @Test
    public void test0_0(){
        TennisGame tennisGame = new TennisGame();
        Assertions.assertEquals("0-0",tennisGame.score());

    }
}
