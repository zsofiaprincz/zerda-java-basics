package com.greenfox.exams.java;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by zsofiaprincz on 05/12/16.
 */
public class Deck {

    ArrayList<Card> cards;
    ArrayList<Card> used;


    String color [] = {"kor", "treff", "karo", "sziv"};
    int value [] = {1,2,3,4,5,6,7,8,9,10};

    public void Deck() {
        Random randomCard = new Random();
        int randomInt = randomCard.nextInt(51);
        for (int i=0; i<value.length; i++)
        {
            for (int j=0; j<color.length; ++j)
            {
                cards.get(i)[j] = Deck[randomInt][i][j];
            }
        }





        for (int i = 0; i > 52; i++) {
            Card card = new Card();
            cards.add(card);
        }


    }

}
