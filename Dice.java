package model;

/**
 *
 * @author niklaswittenbrink
 */

import java.io.Serializable;

public class Dice implements Serializable, Comparable<Dice> {
    private int diceValue;

    public Dice(){}

    public int getDiceValue() {
        return diceValue;
    }

    public void setDiceValue(int diceValue) {
        this.diceValue = diceValue;
    }


    public int compareTo(Dice d) {
        int val = 0;
        if (this.getDiceValue() < d.getDiceValue()) {
            val = -1;
        }
        else if (this.getDiceValue() == d.getDiceValue()) {
            val = 0;
        }
        else {
            val = 1;
        }

        return val;
    }
}