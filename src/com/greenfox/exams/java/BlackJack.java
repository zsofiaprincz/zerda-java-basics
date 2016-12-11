package com.greenfox.exams.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by zsofiaprincz on 05/12/16.
 */
public class BlackJack extends JFrame implements ActionListener {

    JPanel blackJack = new JPanel();
    JLabel user = new JLabel("User played:" + toString());
    JLabel house = new JLabel("House played:" + toString());
    JButton reset = new JButton("New Game");
    JButton drawCard = new JButton("Draw a drawCard");

    public BlackJack(){

        Player userPlayer = new Player("user");
        Player housePlayer = new Player("house");


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setSize(400, 400);

        this.add(blackJack);
        blackJack.add(user);
        blackJack.add(house);
        blackJack.add(reset);
        blackJack.add(drawCard);
        Deck deck = new Deck(); //asszem igy lesz egy deck object h meg tudjuk hivni az actio listenerbe a deck osztaly methodjait

        reset.addActionListener(this);
        drawCard.addActionListener(this);






    }



    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BlackJack();
            }
        });

    }







    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() ==reset){
            Deck deck = new Deck();

        } else if(e.getSource()==drawCard){

        }

    }
}
