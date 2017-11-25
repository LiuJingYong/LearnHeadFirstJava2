package com.ljy.simpleDotCom;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by 18028 on 2017/11/24.
 */
public class SimpleDotComGame {
    public static void main(String[] args) throws Exception {

        int numOfGuess = 0;
        SimpleDotCom simpleDotCom = new SimpleDotCom();

        int locStart = (int)(Math.random() * 5);
        int[] loc = {locStart, locStart + 1, locStart+2};

        simpleDotCom.setLocationCells(loc);

        boolean isAlive = true;

        while (isAlive) {
            System.out.print("Please enter the number your guess: ");
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            String guess = is.readLine();
            if (simpleDotCom.checkIfHits(guess).equals("kill")) {
                isAlive = false;
            }
        }
    }
}
