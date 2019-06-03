package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        int hold = k % j;


        if(k % j == 0){
            return k/j;
        }


        return k/j+hold;
    }
}
