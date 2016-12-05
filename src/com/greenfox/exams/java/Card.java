package com.greenfox.exams.java;

/**
 * Created by zsofiaprincz on 05/12/16.
 */
public class Card {

    String[] color = {"pikk", "kor", "karo", "treff"};
    String[] value = {"asz", "2", "3", "4", "5", "6", "7", "8", "9", "10", "bubi", "dama", "kiraly"};


    for (value s : value.values()) {
        for (color r : color.values()) {
            Card c = new Card(s,r);
        }
    }

}
