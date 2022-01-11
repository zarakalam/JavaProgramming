package day19_LoopPractices;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        //***** not done yet  12/2/21 @ 0952am


        String str = "aabcccd";
        String result = "";

        //char ch = str.charAt(0); // prints 'a'

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int count = 0; //rep frequency of variable "char ch"

            for (int i = 0; i < str.length(); i++) { // 0 = first index char. str.length rep last index aka stopping point
                char each = str.charAt(i); // each character of string

                if (ch == each) {
                    count++;
                }


            }


        }


    }
}
