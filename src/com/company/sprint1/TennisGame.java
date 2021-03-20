package com.company.sprint1;

/**
 * @author abhishek
 */
public class TennisGame {

    private Player player1;
    private Player player2;

    /**
     * Constructor
     * @param player1
     * @param player2
     */
    public TennisGame(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;

    }

    public String getScore() {
        if (player1.getScore() >= 3 && player2.getScore() >= 3) {
            if (Math.abs(player2.getScore() - player1.getScore()) >= 2) {
                return getLeadPlayer().getName() + " win";
            } else if (player1.getScore() == player2.getScore()) {
                return "deuce";
            } else {
                return "advantage " + getLeadPlayer().getName();
            }
        } else {
            return player1.getPlayerScoreDashboard() + "-" + player2.getPlayerScoreDashboard();
        }

    }

    /**
     * Get current lead player by points
     * @return
     */
    private Player getLeadPlayer() {
        return (player1.getScore() > player2.getScore() ? player1 : player2);
    }
}
