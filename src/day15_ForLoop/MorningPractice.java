package day15_ForLoop;

import java.util.Scanner;

public class MorningPractice {
    public static void main(String[] args) {

        System.out.println("Enter a word");
        String word = new Scanner(System.in).next();

        if(word.charAt(0) == 'x'){
            word = word.replaceFirst("x", "a");
        }

        System.out.println(word);



    }
}
/*
enter a word, replace first letter with lowercase a if it starts with lowercase x

 */