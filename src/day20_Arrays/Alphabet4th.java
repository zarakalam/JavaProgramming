package day20_Arrays;

import java.util.Arrays;

public class Alphabet4th {
    public static void main(String[] args) {

        //print the letters from Z-A

        char[] alphabets = new char[26];  //print letters starting from Z all the way to A

        //        i    ch          --- differnt assigned variables for the loop
        alphabets[0]= 'Z';  // assigned index 0 of the char to letter 'Z'

        char ch = 'Z';
        for (int i =0; i< alphabets.length; i++, ch-- ){ // ch is added in order for the char to decrease by 1 after every loop execu.
            alphabets[i]= ch;
        }



        System.out.println( Arrays.toString(alphabets)); //prints as an array
        //System.out.println(alphabets[0]); // prints first element but is not an array (** will come in handy for the task#4)





        }



    }
