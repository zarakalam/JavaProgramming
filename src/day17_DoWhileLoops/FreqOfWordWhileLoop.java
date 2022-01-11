package day17_DoWhileLoops;

import java.util.Locale;

public class FreqOfWordWhileLoop {
    public static void main(String[] args) {

        String str = "Java Java Python Python";

        int frequency = 0;

        while(str.contains("Java")){
            str=str.replaceFirst("Java", "");
            frequency++;
        }

        System.out.println(frequency);


        System.out.println("==========================");

        String str2 = "cat cat cat dog dog dog cat cat";
        //str2 = str2.toLowerCase(); use this method to ignore case sensitivity
        int frequency1 = 0;

        while(str2.contains("cat")){
            str2=str2.replaceFirst("cat", "");
            frequency1++;
        }


        System.out.println(frequency1);


    }




}
