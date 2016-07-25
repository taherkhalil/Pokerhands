package com.taherk.pokerhands;

import java.util.List;

/**
 * Created by Acer on 26-Jul-16.
 */
public class HandsHandler {
    public boolean fullHouse = false;
    private boolean threeOfAKind = false;
    private boolean pair = false;
    private boolean fourOfAKind = false;
    private boolean flush = false;
    private boolean twoOfAKind = false;
    Hands hand = new Hands();

    public void setHand() {

        if (hand.isFullHouse())
        {
            fullHouse=true;
            setStatus(6);

        }
        else if ()

    }
}
