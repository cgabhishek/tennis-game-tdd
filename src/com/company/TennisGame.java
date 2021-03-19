package com.company;

public class TennisGame {


    private int firstPlayerScore;

    public String score() {
        if(firstPlayerScore==1){
            return "15-0";
        }
        return "0-0";
    }

    public void firstPlayerScore() {
        firstPlayerScore++;
    }
}
