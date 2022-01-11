package day01_JavaIntro;

import day24_CustomMethodReturn.ReturnMethodPractice4_7th;
import utilities.StringUtility;

public class Test {

    public static void main(String[] args) {

       String str = "aaaaaaaaaabbbbbbbbbbbbbb";

        str= ReturnMethodPractice4_7th.removeDuplicate(str);

        System.out.println(str);


        System.out.println("======================");

        String str1 = "Wooden Spoon";

        StringUtility.printEachChar(str1);



    }


}
