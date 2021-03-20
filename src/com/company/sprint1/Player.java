package com.company.sprint1;

import java.util.Arrays;
import java.util.List;

/**
 * @author abhishek
 */
public class Player {

    public static final List<String> pointsList = Arrays.asList("0", "15", "30", "40");

    private int score;

    String name;

    public Player(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public void winScore() {
        this.score = this.score + 1;
    }

    public String getPlayerScoreDashboard() {
        return pointsList.get(score);
    }
}
