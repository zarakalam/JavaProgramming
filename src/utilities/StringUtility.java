package utilities;


import java.util.Arrays;

public class StringUtility {


    //prints each char of the  given string
    public static void printEachChar(String str){

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));

        }


    }

    //reverses the given string
    public static String reverse(String str){

        String result = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            result += str.charAt(i);
        }

        return result;
    }

    //checks if the given string is a palindrome, returns boolean
    public static boolean isPalindrome(String str){
       return reverse(str).equalsIgnoreCase(str);


    }

    //checks if the given string is anagram,return boolean
    public static boolean anagram(String str1, String str2){

        char[] ch1= str1.toCharArray();
        char[] ch2= str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);

    }

    //removes the duplicates from the given string, returns String
    public static String removeDuplicate(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if( !result.contains(""+each) ){
                result += each;
            }

        }

        return result;

    }

    // checks to see if the given string password is a strong password based off certain criteria
    public static boolean isStrongPassword(String password){

        boolean eightChars = password.length() >= 8 && !password.contains(" ");
        boolean upperCaseChars= false;
        boolean lowerCaseChars= false;
        boolean specialChars= false;
        boolean digitChars= false; // for all the false booleans, a loop is needed to created in order to print every single char of the string

        char[] chars = password.toCharArray();

        for (char each : chars) {

            if(Character.isUpperCase(each)){
                upperCaseChars=true;
            }else if(Character.isLowerCase(each)){
                lowerCaseChars= true;
            }else if(Character.isDigit(each)){
                digitChars=true;
            }else{    //special char
                specialChars=true;
            }

        }

        boolean isStrongPassword = eightChars && upperCaseChars && lowerCaseChars && specialChars && digitChars;
        return isStrongPassword;

    }




}
