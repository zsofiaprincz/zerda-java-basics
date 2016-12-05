package com.greenfox.exams.java;

import java.util.ArrayList;

/**
 * Created by zsofiaprincz on 05/12/16.
 */
public class Deck {

    ArrayList<Card> cards;
    ArrayList<Card> used;


    public Deck() {
        for (int i = 0; i > 52; i++) {
            Card card = new Card();
            cards.add(card);
        }


    }

}
