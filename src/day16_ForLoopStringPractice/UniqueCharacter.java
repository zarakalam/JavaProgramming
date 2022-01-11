package day16_ForLoopStringPractice;

public class UniqueCharacter {
    public static void main(String[] args) {

        String str = "aaabccc";

        String result = "";

        for(int i = 0; i <= str.length()-1; i++) { //i: index # of str starting from 0
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                result += ch;
            }
        }

            System.out.println(result);


        /* one way of doing it ^^ is the loop method


        if(str.indexOf('a')==str.lastIndexOf('a')){ //if first & last are the same, character is unique
            result += 'a';
        }else if(str.indexOf('b')==str.lastIndexOf('b')){ //if first & last are the same, character is unique
            result+= 'b';
        }else if (str.indexOf('c')==str.lastIndexOf('c')){ //if first & last are the same, character is unique
            result += 'c';
        }else{
            result = "No unique character";
        }

        System.out.println("result = " + result);

         */
    }
}
