package com.zipcodewilmington.assessment1.part5;

import java.util.Arrays;

public class Palindrome {

    public Integer countPalindromes(String input) {


        int counter = 0;
        int g = 0;



        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {

                String holder = input.substring(i, j);
                g++;
                System.out.println(holder);
                int forward = 0;
                int backward = holder.length() - 1;
               for(int k = 0; k < holder.length();k++){
                char forwardChar = holder.charAt(forward);
                char backwardChar = holder.charAt(backward);
                backward--;
                forward++;
                if (forwardChar != backwardChar) {
                    counter++;
                    break;

                }

                }
            }



        }
        return g-counter;
    }
}