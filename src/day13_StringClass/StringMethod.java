package day13_StringClass;

public class StringMethod {

    public static void main(String[] args) {


        //String charAt method:

        String word = "Cydeo";

        char thirdChar = word.charAt(2); //prints out 3rd character

        System.out.println("thirdChar = " + thirdChar);

        /*
        char tenthChar = word.charAt(9);
         */


        System.out.println("-----------------");

        //String length method:

        String s1 = "Batch 25 is the best batch. Java Programming Language";

        int totalChars = s1.length(); // prints outs total number of chara. as int.

        System.out.println("totalChars = " + totalChars);

        System.out.println("------------------------------------");

        //String

        char lastChar = s1.charAt(totalChars -1); // will print out last charac.

        System.out.println("lastChar = " + lastChar);

        System.out.println("-----------------------------------------");

        //String toUpperCase method:

        String str = "wooden spoon";
        str = str.toUpperCase(); //"WOODEN SPOON" will print the orig string as all caps

        System.out.println(str);
        // Today is a great day to learn java programming language.
        String sentence = "Today is a great day to learn java programming language.";
        sentence = sentence.toUpperCase(); // will print above string as ALL CAPS

        System.out.println(sentence);
    }
}
