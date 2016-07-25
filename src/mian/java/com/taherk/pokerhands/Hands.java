package com.taherk.pokerhands;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by taherk on 7/25/2016.
 */
public class Hands {
    

    public void player1Hand(List<String> player1) {
        for (int i = 0; i < player1.size(); i++) {


        }
    }

    public void player2Hand(List<String> player2) {

    }

    public boolean isFullHouse(List<String> decks) {
        int counter = 0;
        List<Integer> temp = new ArrayList<>();
        iterate(counter, decks, temp);
        if (temp.contains(2) && temp.contains(3)) {
            return true;

        }
        return false;

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
        iterate2(counter2, temp, temp2);
        if (temp2.contains(4)){
            twoOfAKind  =true;
        }

    }

    private void iterate2(int counter2, List<Integer> temp, List<Integer> temp2) {
        for (Integer b:temp)
        {
            for(Integer c:temp){
                if(b.equals(c))
                    counter2++;
            }
            temp2.add(counter2);
        }
    }
}
