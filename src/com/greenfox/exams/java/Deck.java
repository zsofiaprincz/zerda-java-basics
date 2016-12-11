package com.greenfox.exams.java;

import java.util.*;

/**
 * Created by zsofiaprincz on 05/12/16.
 */
public class Deck {

    ArrayList<Card> cards;
    ArrayList<Card> used;
    private static final String[] COLORS = new String[]{"karo", "treff", "kor", "pikk"};




    public Deck() {

        cards = new ArrayList<>();
        for (String color : COLORS) {
            for (int i = 1; i < 14; i++) {
//                    Card card = new Card (color,i);
//                    cards.add(card);

                cards.add(new Card(color, i));
                Collections.shuffle(cards);
            }
        }


        used = new ArrayList<>();




    }

    public Card draw() {
        if (cards.size() == 0){
            return null;
        }
        Card removed = cards.remove(0);  //a remove-al nem torlom ki orokre , hanem csak kiveszem
        used.add(removed);
        return removed;
    }


    public ArrayList<Card> getCards() {
        return cards;
    }
}





