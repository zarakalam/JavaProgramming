package day19_LoopPractices;

public class UniqueCharacters2nd {

    public static void main(String[] args) {

        String str= "aabccdeef";
        String result = ""; //reserve this string result for the unique chars


        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int count = 0; //rep frequency of variable "char ch"

            for (int i = 0; i < str.length(); i++) { // 0 = first index char. str.length rep last index aka stopping point
                char each = str.charAt(i); // each character of string

                if(ch == each){
                    count++;
                }

            }

            if(count ==1) {// if the frequency of the char is 1, then the char is unique
                result += ch;

               /*
               if(count !=1){
               continue;
               }
                */ //another way to write the if statement....
            }
        }

        System.out.println(result);

    }

}

// print out unique char without index of and last indiex of
