package com.taherk.pokerhands;


import java.lang.reflect.Array;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by taherk on 7/22/2016.
 */
public class PokerHands {
    public List<String> player1;
    public List<String> player2;
    private static final List<String> ranks  = new ArrayList<String>();
    private static final List<String> suits  = new ArrayList<String>();

     PokerHands() {
        player1 = new ArrayList<String>();
        player2 = new ArrayList<String>();
        ranks.add("A");
        ranks.add("2");
        ranks.add("3");
        ranks.add("4");
        ranks.add("5");
        ranks.add("6");
        ranks.add("7");
        ranks.add("8");
        ranks.add("9");
        ranks.add("J");
        ranks.add("Q");
        ranks.add("K");
        suits.add("H");
        suits.add("D");
        suits.add("S");
        suits.add("C");
    }

    public void setValuesForPlayer1(List<String> valuesForPlayer1) {
        player1.addAll(valuesForPlayer1);
        System.out.println(player1.toString());
}
    public void setValuesForPlayer2(List<String> valuesForPlayer2) {
        player2.addAll(valuesForPlayer2);
        System.out.println(player2.toString());
    }

public void checkSize(){
    if (player1.size() != 5 && player2.size() != 5 )
        throw new InvalidInputNumberException();
}

    public void testType() {

        for(int i=0;i<=player1.size()-1;i++)
        {
            if (! (ranks.contains(player1.get(i).charAt(0))&& suits.contains(player1.get(i).charAt(1) ) )
                    && !( ranks.contains(player2.get(i).charAt(0))&& suits.contains(player2.get(i).charAt(1) ))
                    )            {
                throw new InvalidInputTypeException();
            }
        }

    }

    public void compare() {
        Hands hand=new Hands();
        hand.player1Hand(player1);
        hand.player2Hand(player2);
    }


    public class InvalidInputNumberException extends RuntimeException {

    }

    public class InvalidInputTypeException extends RuntimeException {

    }
}
