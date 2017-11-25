package com.ljy.simpleDotCom;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 18028 on 2017/11/24.
 */
public class SimpleDotCom {
    private int[] locationCells;
    private Map<Integer, String> hasGuess;
    private int numOfHits;

    public SimpleDotCom(){
        this.hasGuess = new HashMap<>();
        this.numOfHits = 0;
        this.locationCells = new int[3];
    }

    public void setLocationCells(int[] locs) {
        this.locationCells = locs;
    }

    public String checkIfHits(String guess) throws Exception{
        int guessNum = Integer.parseInt(guess);
        if (guessNum < 0) {
            Exception e = new Exception("Please enter positive number.");
            throw e;
        }

        String result = "miss";

        if (!hasGuess.containsValue(guess)) {
            for (int i : locationCells) {
                if (i == guessNum) {
                    result = "hit";
                    numOfHits++;
                    break;
                }
            }
            hasGuess.put(guessNum, guess);
        } else {
            result = "you have guessed this number.";
        }

        if (numOfHits == locationCells.length) {
            result = "kill";
        }

        System.out.println(result);
        return result;
    }
}
