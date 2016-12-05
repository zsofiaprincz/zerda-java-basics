package com.greenfox.exams.java;

import java.util.ArrayList;

/**
 * Created by zsofiaprincz on 05/12/16.
 */
public class Deck {

    ArrayList<Card> cards;
    ArrayList<Card> used;


    String color [] = {"kor", "treff", "karo", "sziv"};
    int value [] = {1,2,3,4,5,6,7,8,9,10};

    public Deck() {



        for (int i = 0; i > 52; i++) {
            Card card = new Card();
            cards.add(card);
        }


    }

}
