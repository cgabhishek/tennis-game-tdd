package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * @author abhishek
 */

public class TennisGameTest {

    Player player1;
    Player player2;
    TennisGame tennisGame;

    @BeforeEach
    public void beforeTennisGameTest() {
        player1 = new Player("player1");
        player2 = new Player("player2");
        tennisGame = new TennisGame(player1, player2);
    }

    @Test
    public void test0_0() {
        TennisGame tennisGame = new TennisGame(player1, player2);
        assertThat(tennisGame, hasProperty("score", is("0-0")));

    }

    @Test
    public void test0_15() {
        player2.winScore();
        assertThat(tennisGame, hasProperty("score", is("0-15")));
    }

    @Test
    public void test30_15() {
        player1.winScore();
        player1.winScore();
        player2.winScore();
        assertThat(tennisGame, hasProperty("score", is("30-15")));
    }

    @Test
    public void test40_0() {
        scoreWinByPlayer(3,player1 );
        assertThat(tennisGame, hasProperty("score", is("40-0")));
    }

    @Test
    public void testAdvantagePlayer1() {
        scoreWinByPlayer(4,player1 );
        scoreWinByPlayer(3,player2 );
        assertThat(tennisGame, hasProperty("score", is("advantage player1")));
    }

    @Test
    public void testAdvantagePlayer2() {
        scoreWinByPlayer(3,player1 );
        scoreWinByPlayer(4,player2 );
        assertThat(tennisGame, hasProperty("score", is("advantage player2")));
    }

    @Test
    public void testDeuceIfPlayerScoreEqually() {
        scoreWinByPlayer(3, player1);
        scoreWinByPlayer(3, player2);
        assertThat(tennisGame, hasProperty("score", is("deuce")));
        scoreWinByPlayer(1, player1);
        assertThat(tennisGame, hasProperty("score", is(not("deuce"))));
        scoreWinByPlayer(1, player2);
        assertThat(tennisGame, hasProperty("score", is("deuce")));
    }

    @Test
    public void testGameShouldBeWonByTheFirstPlayer() {
        scoreWinByPlayer(4, player1);
        scoreWinByPlayer(3, player2);
        assertThat(tennisGame, hasProperty("score", is(not("player1 win"))));
        assertThat(tennisGame, hasProperty("score", is(not("player2 win"))));
        scoreWinByPlayer(1, player1);
        assertThat(tennisGame, hasProperty("score", is("player1 win")));
    }

    @Test
    public void testGameShouldBeWonByTheSecondPlayer() {
        scoreWinByPlayer(4, player2);
        scoreWinByPlayer(3, player1);
        assertThat(tennisGame, hasProperty("score", is(not("player1 win"))));
        assertThat(tennisGame, hasProperty("score", is(not("player2 win"))));
        scoreWinByPlayer(1, player2);
        assertThat(tennisGame, hasProperty("score", is("player2 win")));
    }

    /**
     * Common method to update score by current player
     * @param times
     * @param player
     */
    private void scoreWinByPlayer(int times, Player player){
        for (int i = 0; i < times; i++) {
            player.winScore();
        }
    }


}
