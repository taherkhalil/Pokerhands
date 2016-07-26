package com.taherk.pokerhands;

import java.util.List;

/**
 * Created by Acer on 26-Jul-16.
 */
public class HandsHandler {
    public boolean fullHouse = false;
    public boolean threeOfAKind = false;
    public boolean pair = false;
    public boolean fourOfAKind = false;
    public boolean flush = false;
    public boolean twoOfAKind = false;
    Hands hand = new Hands();

    public void setHandForPlayer1() {

        if (hand.isFullHouse(new PokerSetUp().getPlayer1()))
        {
            fullHouse=true;
            setStatus(6);

        }
        else if ()

    }
}
