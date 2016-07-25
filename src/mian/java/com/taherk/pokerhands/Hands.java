package com.taherk.pokerhands;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by taherk on 7/25/2016.
 */
public class Hands {
    private boolean fullHouse = false;
    private boolean threeOfAKind = false;
    private boolean pair = false;
    private boolean fourOfAKind = false;
    private boolean flush = false;
    private boolean twoOfAKind=false;

    public void player1Hand(List<String> player1) {
        for (int i = 0; i < player1.size(); i++) {


        }
    }

    public void player2Hand(List<String> player2) {

    }

    public void fullHouse(List<String> decks) {
        int counter = 0;
        List<Integer> temp = new ArrayList<>();
        iterate(counter, decks, temp);
        if (temp.contains(2) && temp.contains(3)) {
            fullHouse = true;
        }

    }

    public void threeOfAKind(List<String> decks) {
        int counter = 0;
        List<Integer> temp = new ArrayList<>();
        iterate(counter, decks, temp);
        if (temp.contains(3)) {
            threeOfAKind = true;
        }

    }

    public void pair(List<String> decks) {
        int counter = 0;
        List<Integer> temp = new ArrayList<>();
        iterate(counter, decks, temp);
        if (temp.contains(2)) {
            pair = true;
        }

    }

    public void fourOfAKind(List<String> decks) {
        int counter = 0;
        List<Integer> temp = new ArrayList<>();
        iterate(counter, decks, temp);
        if (temp.contains(4)) {
            fourOfAKind = true;
        }

    }

    private void iterate(int counter, List<String> decks, List<Integer> temp) {
        for (String a : decks) {
            for (String b : decks) {
                if (a.charAt(0) == b.charAt(0)) {
                    counter++;
                }
            }
            temp.add(counter);
        }
    }

    public void flush(List<String> decks) {
        int counter = 0;
        List<Integer> temp = new ArrayList<>();
        for (String a : decks) {
            for (String b : decks) {
                if (a.charAt(1) == b.charAt(1)) {
                    counter++;
                }
            }
            temp.add(counter);
        }
        if (temp.contains(5)) {
            flush = true;
        }
    }
    public void twoOfAKind(List<String> decks){
        int counter = 0;
        int counter2=0;
        List<Integer> temp = new ArrayList<>();
        List<Integer> temp2 = new ArrayList<>();
        iterate(counter, decks, temp);
        for (Integer b:temp)
        {
            for(Integer c:temp){
                if(b.equals(c))
                    counter2++;
            }
            temp2.add(counter2);
        }
        if (temp2.contains(4)){
            twoOfAKind  =true;
        }

    }
}
