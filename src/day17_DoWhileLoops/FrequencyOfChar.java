package day17_DoWhileLoops;

public class FrequencyOfChar {
    public static void main(String[] args) {

        String str = "AAAAAAbbbbbBBBccaaaAAA";
        char ch = 'A';

        int frequency = 0;

        for (int i = 0; i < str.length(); i++) { //i: indexes of the string
            char eachChar = str.charAt(i); // eachChar: each character of the string

           if (ch == eachChar) { // if given char is matching with the character in the string
                frequency++; // this will add the number frequency by 1
            }


        }

        System.out.print(frequency);
    }

}
