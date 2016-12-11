package com.greenfox.exams.java;

import java.util.ArrayList;

/**
 * Created by zsofiaprincz on 05/12/16.
 */
public class Player {

    String name;
    ArrayList<Card> played;

    public Player(String name) {
        this.name = name;
        played = new ArrayList<>();
    }



    public int sum() {
       int sum = 0;
        for (Card card : played){
            sum += card.getValue();
        }
        return sum;
    }

    public void add(Card drawn){
        played.add(drawn);

    }

    @Override
    public String toString() {
        return "Player{" +
                "played=" + played +
                '}';
    }
}
