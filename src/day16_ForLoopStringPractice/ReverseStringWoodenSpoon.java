package day16_ForLoopStringPractice;

public class ReverseStringWoodenSpoon {
    public static void main(String[] args) {



        String str = "Wooden Spoon";
        //how to get characters of the string.. utilize Index... 012345.....
        String result = ""; // contain the reversed version of the string

        /* how to print a string backwards manually
        result += str.charAt( str.length()-1); // prints out "n" ... the..... += is used for concatenating rather than assign

        result += str.charAt(10); //should print out "o" .. would need to repeat this step until index 0

        System.out.println(result);

        */

      // for(int i = 11; i>= 0; i -= 1){

        for(int i = str.length()-1; i >= 0; i--){  // i: is rep index numbers of str(starting from last to 0)
                result += str.charAt(i); // bc charAt gives you the characters from the string
       }


        System.out.println(result);
        System.out.println("======================================");

        String str2 = "Zarak Zarak Zarak Zarak Zarak Zarak Zarak Zarak";
        String result1 = "";

        for(int i = str2.length()-1; i >= 0; i--){
            result1 += str2.charAt(i);
        }

        System.out.println(result1);


    }
}
/*

        Write a program to reverse a string
        ex Input:
            Wooden Spoon
           Output:
             noopS nedooW

 */