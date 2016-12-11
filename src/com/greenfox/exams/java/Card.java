package com.greenfox.exams.java;

/**
 * Created by zsofiaprincz on 05/12/16.
 */
public class Card {

//    It would be nice but I think it will not work as we need the values
//
//    String[] color = {"pikk", "kor", "karo", "treff"};
//    String[] value = {"asz", "2", "3", "4", "5", "6", "7", "8", "9", "10", "bubi", "dama", "kiraly"};


    String color;
    int value;



//    public Card(){} nem kell

    public Card(String color, int value) {
        this.color = color;
        if (value >10){
            this.value=10;
        }
        this.value = value;
    }


    public int getValue() {
        return value;
    }



    @Override
    public String toString() {
        return color + " " + value;
    }


}
