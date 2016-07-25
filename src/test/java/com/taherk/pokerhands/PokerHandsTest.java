package com.taherk.pokerhands;


import org.junit.Test;

/**
 * Created by taherk on 7/22/2016.
 */
public class PokerHandsTest {

    @Test(expected = PokerHands.InvalidInputException.class)
    public void itShouldTakeValidInput_FiveValues(){
        //given
       // PokerHands pk =new PokerHands();
        PokerHands.getValues(new PokerHands("5C"));
        PokerHands.getValues(new PokerHands("3H"));
        PokerHands.getValues(new PokerHands("2D"));
        PokerHands.getValues(new PokerHands("2H"));
        PokerHands.getValues(new PokerHands("3C"));
        PokerHands.getValues(new PokerHands("1234"));
        //

        //when

        //then

    }



}
