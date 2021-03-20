package com.company.sprint2;

/**
 * @author abhishek
 */
public class Game {
    private Player player1;
    private Player player2;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public String getScore() {
        if (player1.getScore() >= 6 || player2.getScore() >= 6) {
            if (Math.abs(player2.getScore() - player1.getScore()) >= 2 && (player1.getScore() < 5 || player2.getScore() < 5)) {
                return getLeadPlayer().getName() + " win set";
            } else if ((player1.getScore() == 7 || player2.getScore() == 7) && (Math.abs(player2.getScore() - player1.getScore()) >= 1)) {
                return getLeadPlayer().getName() + " win the match";
            } else if (player1.getScore() >= 6 && player2.getScore() >= 6) {
                //tie break rule activated
                if (Math.abs(player2.getScore() - player1.getScore()) >= 2) {
                    //player win the tie break, win the set and the match
                    return getLeadPlayer().getName() + " win the set and match";
                }
            } else {
                return "";
            }
        } else {
            return player1.getPlayerScoreDashboard() + "-" + player2.getPlayerScoreDashboard();
        }
        return "";
    }

    public Player getLeadPlayer() {
        return (player1.getScore() > player2.getScore()) ? player1 : player2;
    }
}
