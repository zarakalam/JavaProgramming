package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram10th {

    public static void main(String[] args) {

        String str1 = "acbd";
        String str2 = "dbca";  // you cannot sort strings

        //write a program to see if str1 and 2 are anagrams:

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        //System.out.println(Arrays.toString(ch1));
        //System.out.println(Arrays.toString(ch2));

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        //System.out.println();

        //System.out.println(Arrays.toString(ch1));
        //System.out.println(Arrays.toString(ch2));

        boolean result = Arrays.equals(ch1,ch2);
        System.out.println("result = " + result);





    }
}
