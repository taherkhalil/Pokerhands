package com.taherk.pokerhands;

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by taherk on 7/22/2016.
 */
public class PokerHands extends String {
    public static List<java.lang.String> ls=new ArrayList<>();


    public PokerHands(java.lang.String s) {
        ls.add(s);
    }

    public static void getValues(String s) {
//        ls.add(s);
        if(ls.size()!=5)
            throw  new InvalidInputException();
    }


    public static class InvalidInputException extends RuntimeException {
    }
}
