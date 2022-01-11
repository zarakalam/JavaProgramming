package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MorningPractice {

    public static void main(String[] args) {

        //Reverse sentence:
            //first step is to split each word into an array
            // create a String reverse variable
            // create a reverse for loop shortcut (array varibale.forr)
            // assign the array variable name plus i and assign it to the reverse string created.
            // enter print statement outside the for loop.


        String sentence = "Today is a good day to learn Java";

        String[] words = sentence.split(" ");  //1st step*******
        //System.out.println(Arrays.toString(words));

        String reverseSentence = ""; //2nd step******

        for (int i = words.length -1 ; i >=0; i--) { //3rd step***********
            reverseSentence += words[i] + " "; //4th step***************

        }

        System.out.println(reverseSentence); //5th step******************
        System.out.println("=======================================================");

        //Reverse the second word:

        //1st step --> create array and split the sentence words into the array
        //2nd step --> create a string variable to contain the reverse words
        //3rd step --> create a reverse for loop, starting the iteration from the 2nd word which is index 1 in the array
        //4th step --> assign the reverse variable created by using the += operator to the array variable plus index #.charAt(i)
        //5th step --> print out the statement...

        //If you want to place the reversed word into the array and print out as a sentence

        //6th step --> assign the array variable to the string reverse
        //7th step --> print out the array variable as an array
        //8th step --> create a for each loop using the array variable
        //9th step --> print out the sentence using concatenation

        String str = "I love Java";

        String[] words1 = str.split(" ");  //----------> 1st step

        String reverse = "";  //----------> 2nd step

        for (int i = words1[1].length()-1; i>=0; i--){  //----------> 3rd step
            reverse += words1[1].charAt(i); //----------> 4th step
        }

        System.out.println(reverse);  //----------> 5th step
        words1[1]=reverse;      //----------> 6th step

        System.out.println(Arrays.toString(words1));  //----------> 7th step

        for (String s : words1) {  //----------> 8th step
            System.out.print(s+ " ");  //----------> 9th step

        }

        }
    }
