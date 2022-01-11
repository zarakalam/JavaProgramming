package day25_CustomMethod_Overloading;

import utilities.StringUtility;


public class Test1 {


    public static void main(String[] args) {

        String str = "Java Programming language";

        StringUtility.printEachChar(str);

        System.out.println("=================");

        String s1 = "Wooden Spoon";
        s1= StringUtility.reverse(s1);
        System.out.println(s1);

        System.out.println("=========================");

        String word = "Civic";
        boolean isPalindrome =StringUtility.isPalindrome(word);
        System.out.println("isPalindrome = " + isPalindrome);

        System.out.println("=================================");

        String[] names = {"Anna", "Java", "Python", "racecar", "Mom", "Cydeo"};

        int count = 0;

        for (String each : names) {
            if(StringUtility.isPalindrome(each)){
                count++;
            }

        }

        System.out.println(count);

        System.out.println("============================");

        String s2 = "Swoop";

        String nonDup = StringUtility.removeDuplicate(s2);
        System.out.println(nonDup);


    }





}