package com.company.sprint2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author abhishek
 */
public class GameTest {
    Player player1;
    Player player2;
    Game game;

    @BeforeEach
    public void beforeGameTest() {
        player1 = new Player("player1");
        player2 = new Player("player2");
        game = new Game(player1, player2);
    }

    @Test
    public void testPlayer1Score(){
        assertThat(game,hasProperty("score",is("0-0")));
    }

    @Test
    public void testPlayer1Score4(){
        scoreWinByPlayer(4, player1);
        assertThat(game,hasProperty("score",is("4-0")));
    }

    @Test
    public void testPlayer1Score6AndPlayer2score2(){
        scoreWinByPlayer(6, player1);
        scoreWinByPlayer(2, player2);
        assertThat(game,hasProperty("score",is("player1 win set")));
    }

    @Test
    public void testPlayer1Score7AndPlayer2score5(){
        scoreWinByPlayer(7, player1);
        scoreWinByPlayer(5, player2);
        assertThat(game,hasProperty("score",is("player1 win the match")));
    }

    @Test
    public void testPlayer1Score7AndPlayer2score6(){
        scoreWinByPlayer(7, player1);
        scoreWinByPlayer(6, player2);
        assertThat(game,hasProperty("score",is("player1 win the match")));
    }

    @Test
    public void testPlayer1Score6AndPlayer2score7(){
        scoreWinByPlayer(6, player1);
        scoreWinByPlayer(7, player2);
        assertThat(game,hasProperty("score",is("player2 win the match")));
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
