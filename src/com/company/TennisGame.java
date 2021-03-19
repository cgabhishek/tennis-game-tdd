package com.company;

import java.util.HashMap;
import java.util.Map;

public class TennisGame {

    private int firstPlayerScore;

    public String score() {

        Map<Integer, String> map = new HashMap<Integer, String>() {{
            put(1, "15");
            put(2, "30");
            put(3, "40");
            put(4, "Win game");
        }};
        if (firstPlayerScore >0 && firstPlayerScore < 4  ) {
            return map.get(firstPlayerScore) + "-0";
        }else if(firstPlayerScore==4){
            return map.get(firstPlayerScore);

        }
        return "0-0";
    }

    public void firstPlayerScore() {
        firstPlayerScore++;
    }
}
