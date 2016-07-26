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
    public boolean twoPair = false;
    public boolean highCard=false;
    Hands hand = new Hands();
    private int status1;
    private int status2;
    public boolean player1=false;
    public boolean player2=false;

    public void setHandForPlayer1(List<String> player1) {

        if (hand.isFullHouse(player1)) {
            fullHouse = true;
            setStatusForPlayer1(6);
        }
        if (hand.isFlush(player1))
        {
            flush=true;
            setStatusForPlayer1(5);
        }
        if (hand.isFourOfAKind(player1))
        {
            fourOfAKind=true;
            setStatusForPlayer1(7);
        }
        if (hand.isPair(player1))
        {
           pair=true;
            setStatusForPlayer1(1);
        }
        if (hand.isTwoPair(player1))
        {
            twoPair=true;
            setStatusForPlayer1(2);
        }
        if (hand.isThreeOfAKind(player1))
        {
            threeOfAKind=true;
            setStatusForPlayer1(3);
        }
        else
        {
            highCard=true;
            setStatusForPlayer1(0);
        }


    }

    public void setStatusForPlayer1(int status) {
        this.status1 = status;
    }
    public int getStatusForPlayer1()
    {
        return status1;
    }

    public void setHandForPlayer2(List<String> player2) {

        if (hand.isFullHouse(player2)) {
            fullHouse = true;
            setStatusForPlayer2(6);
        }
        if (hand.isFlush(player2))
        {
            flush=true;
            setStatusForPlayer2(5);
        }
        if (hand.isFourOfAKind(player2))
        {
            fourOfAKind=true;
            setStatusForPlayer2(7);
        }
        if (hand.isPair(player2))
        {
            pair=true;
            setStatusForPlayer2(1);
        }
        if (hand.isTwoPair(player2))
        {
            twoPair=true;
            setStatusForPlayer2(2);
        }
        if (hand.isThreeOfAKind(player2))
        {
            threeOfAKind=true;
            setStatusForPlayer2(3);
        }
        else
        {
            highCard=true;
            setStatusForPlayer2(0);
        }


    }

    public void setStatusForPlayer2(int status) {
        this.status2 = status;
    }
    public int getStatusForPlayer2()
    {
        return status2;
    }

    public void declareWinner() {
        if(getStatusForPlayer2()<getStatusForPlayer1())
        {
            System.out.print("player 2 wins");
            player2=true;
        }
        else
        {
            System.out.print("player 1 wins");
            player1=true;
    }
    }
}
