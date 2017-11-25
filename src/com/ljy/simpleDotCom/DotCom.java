package com.ljy.simpleDotCom;

import java.util.ArrayList;

/**
 * Created by 18028 on 2017/11/24.
 */
public class DotCom {
    private ArrayList<String> locationCells;

    public void setLocationCells(ArrayList<String> locs) {
        this.locationCells = locs;
    }

    public String checkIfHits(String userInput) throws Exception{
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(userInput);
            if (locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";

            }
        }

        System.out.println(result);
        return result;
    }
}
