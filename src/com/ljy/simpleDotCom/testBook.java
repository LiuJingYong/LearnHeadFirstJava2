package com.ljy.simpleDotCom;

/**
 * Created by 18028 on 2017/11/24.
 */
public class testBook {
    public static void main(String[] args) {
        testBook t = new testBook();
        t.go();
    }

    public void go() {
        int y = 7;
        for (int x = 1; x < 8; x++) {
            y++;
            if (x > 4) {
                System.out.print(++y + " ");
            }
            if (y > 14) {
                System.out.println(" x = " + x);
                break;
            }
        }
    }
}
