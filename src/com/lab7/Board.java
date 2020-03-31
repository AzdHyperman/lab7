package com.lab7;

public class Board {
    private int value;


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    //generam progresie artimetica pentru tokens
    static void generateProgression(int a, int m, int n)
    {
        int curr_term;
        curr_term=a;
        for (int i = 1; i <= n; i++)
        { System.out.print(curr_term + " ");
            curr_term =curr_term + m;

        }
    }

}
