package day28_ArrayList;

import utilities.StringUtility;



public class TestBooleanStrongPassStringUtil_Me {

    public static void main(String[] args) {

        String password = "Charles1099!";

        boolean isStrong= StringUtility.isStrongPassword(password);   // called isStrongPassword from String Util and assigned it to boolean since it returns boolean
        System.out.println("isStrong = " + isStrong); // print statement inside main method.



    }



}
