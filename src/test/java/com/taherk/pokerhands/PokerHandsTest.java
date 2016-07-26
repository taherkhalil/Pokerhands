package com.taherk.pokerhands;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by taherk on 7/22/2016.
 */
public class PokerHandsTest {

    @Test(expected = PokerSetUp.InvalidInputNumberException.class)
    public void itShouldTakeValidInput_FiveValues() {
        PokerSetUp pk = new PokerSetUp();
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

    @Test(expected = PokerSetUp.InvalidInputTypeException.class)
    public void itShouldTakeValidInput_Type() {
        PokerSetUp pk = new PokerSetUp();
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
    public void itShouldCheckDeckAndSelectHand() {
        PokerSetUp pk = new PokerSetUp();
        List<String> player1 = new ArrayList<String>();
        List<String> player2 = new ArrayList<String>();
        player1.add("JS");
        player1.add("2D");
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
        HandsHandler h = new HandsHandler();
        h.setHandForPlayer1(player1);

        Assert.assertEquals(true, h.fourOfAKind);
        h.setHandForPlayer2(player2);
        Assert.assertEquals(true, h.threeOfAKind);
    }
    @Test
    public void itShouldDeclareProperWinner() {
        PokerSetUp pk = new PokerSetUp();
        List<String> player1 = new ArrayList<String>();
        List<String> player2 = new ArrayList<String>();
        player1.add("JS");
        player1.add("2D");
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
        HandsHandler h = new HandsHandler();
        h.setHandForPlayer1(player1);
        h.setHandForPlayer2(player2);
        h.declareWinner();
        Assert.assertEquals(true,h.player1);



    }

}
