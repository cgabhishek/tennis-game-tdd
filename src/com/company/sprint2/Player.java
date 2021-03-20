package com.company.sprint2;

import java.util.Arrays;
import java.util.List;

public class Player {
    public static final List<String> pointsList = Arrays.asList("0", "1", "2", "3","4","5","6","7");

    private int score;
    public int getScore() {
        return score;
    }
    String name;
    public String getName() {
        return name;
    }

    public void winScore() {
        this.score = this.score + 1;
    }

    public Player(String name) {
        this.name = name;
    }

    public String getPlayerScoreDashboard(){
        return pointsList.get(score);
    }
}
