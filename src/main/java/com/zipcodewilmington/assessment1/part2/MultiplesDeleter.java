package com.zipcodewilmington.assessment1.part2;
import java.util.*;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {

       List<Integer> answer = new ArrayList<Integer>();

        for (int i = 0; i <ints.length ; i++) {

            if(ints[i] %2 != 0){
                answer.add(ints[i]);
            }


        }
        Integer[] answer1 = answer.toArray(new Integer[answer.size()]);

        return answer1;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        List<Integer> answer = new ArrayList<Integer>();

        for (int i = 0; i <ints.length ; i++) {

            if(ints[i] %2 == 0){
                answer.add(ints[i]);
            }


        }
        Integer[] answer1 = answer.toArray(new Integer[answer.size()]);

        return answer1;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        List<Integer> answer = new ArrayList<Integer>();

        for (int i = 0; i <ints.length ; i++) {

            if(ints[i] %3 != 0){
                answer.add(ints[i]);
            }


        }
        Integer[] answer1 = answer.toArray(new Integer[answer.size()]);

        return answer1;
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        List<Integer> answer = new ArrayList<Integer>();

        for (int i = 0; i <ints.length ; i++) {

            if(ints[i] %multiple != 0){
                answer.add(ints[i]);
            }


        }
        Integer[] answer1 = answer.toArray(new Integer[answer.size()]);

        return answer1;

    }
}
