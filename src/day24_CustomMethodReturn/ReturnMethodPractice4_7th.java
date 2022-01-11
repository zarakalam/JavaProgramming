package day24_CustomMethodReturn;

public class ReturnMethodPractice4_7th {

    public static void main(String[] args) {

        String str = "aabbaacc";

        str = removeDuplicate(str);
        System.out.println(str);


    }


    public static String removeDuplicate(String str){

        String result = "";

        for(int i = 0; i <= str.length()-1; i++){ // ; // will index from 0 until last index
            char each = str.charAt(i);

            if( !result.contains(""+each)){ //if character is not contained in the result
                result += each; // the character will be added to the result
            }
        }

        return result;

    }



}
