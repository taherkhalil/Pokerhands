package com.taherk.pokerhands;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by taherk on 7/22/2016.
 */
public class PokerHandsTest {

    @Test(expected = PokerHands.InvalidInputNumberException.class)
    public void itShouldTakeValidInput_FiveValues() {
        PokerHands pk = new PokerHands();
        List<String> player1 = new ArrayList<String>();
        List<String> player2 = new ArrayList<String>();
        player1.add("2D");
        player1.add("2D");
        player1.add("2D");
        player1.add("2D");
        pk.setValuesForPlayer1(player1);

        player2.add("2D");
        player2.add("2D");
        player2.add("2D");
        player2.add("2D");
        pk.setValuesForPlayer2(player2);
        pk.checkSize();

    }
    @Test(expected = PokerHands.InvalidInputTypeException.class)
    public void itShouldTakeValidInput_Type(){
        PokerHands pk = new PokerHands();
        List<String> player1 = new ArrayList<String>();
        List<String> player2 = new ArrayList<String>();
        player1.add("2D");
        player1.add("2D");
        player1.add("23");
        player1.add("2D");
        pk.setValuesForPlayer1(player1);

        player2.add("2D");
        player2.add("2t");
        player2.add("24");
        player2.add("2D");
        pk.setValuesForPlayer2(player2);
        pk.testType();
    }
    @Test
    public void itShouldCheckDeckAndSelectHand(){
        PokerHands pk = new PokerHands();
        List<String> player1 = new ArrayList<String>();
        List<String> player2 = new ArrayList<String>();
        player1.add("JS");
        player1.add("JD");
        player1.add("2H");
        player1.add("2D");
        player1.add("2S");
        pk.setValuesForPlayer1(player1);

        player2.add("AD");
        player2.add("8D");
        player2.add("2C");
        player2.add("2S");
        player2.add("2H");
        pk.setValuesForPlayer2(player2);
        pk.compare();


    }


}
