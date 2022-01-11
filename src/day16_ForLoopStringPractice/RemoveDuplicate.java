package day16_ForLoopStringPractice;

public class RemoveDuplicate {
    public static void main(String[] args) {

        String str = "aabbaacc";
        String result = "";

        for(int i = 0; i <= str.length()-1; i++){ // ; // will index from 0 until last index
            String ch = "" +str.charAt(i); // represents each character of str

            if( !result.contains(ch)){ //if character is not contained in the result
                result += ch; // the character will be added to the result
            }
        }

        System.out.println(result);
        System.out.println("====================");






    }
}
