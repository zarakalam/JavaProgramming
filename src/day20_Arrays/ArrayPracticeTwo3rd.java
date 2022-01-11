package day20_Arrays;

import java.util.Arrays;

public class ArrayPracticeTwo3rd {
    public static void main(String[] args) {

        //print the letters A-Z

        char[] letters = new char[26];

        char ch = 'A';
        for (int i = 0; i < letters.length; i++, ch++) {
            letters[i] = ch;

        }
        System.out.println(Arrays.toString(letters));
        System.out.println("========================================");

    }
}
