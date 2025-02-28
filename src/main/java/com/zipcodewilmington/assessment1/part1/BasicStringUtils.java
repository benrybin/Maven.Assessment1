package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {

        str = str.substring(0,1).toUpperCase() + str.substring(1);


        return str;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {

         StringBuilder answer = new StringBuilder(str);
         answer = answer.reverse();
         str = answer.toString();

        return str;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        StringBuilder answer = new StringBuilder(str);
        answer = answer.reverse();
        str = answer.toString();
        str = str.substring(0,1).toUpperCase() + str.substring(1);
        return str;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {

                str = str.substring(1,str.length()-1);


        return str;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {

        char[] strArray = str.toCharArray();
        for (int i = 0; i < strArray.length; i++) {

            char check = strArray[i];
            if(Character.isUpperCase(check)){
                strArray[i] = Character.toLowerCase(check);

            }else if(Character.isLowerCase(check)){
                strArray[i] = Character.toUpperCase(check);

            }


        }
        String answer = new String(strArray);

        return answer;
    }
}
