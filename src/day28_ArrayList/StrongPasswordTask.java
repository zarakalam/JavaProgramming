package day28_ArrayList;

public class StrongPasswordTask {

    public static void main(String[] args) {

        String password = "Cydeo1990@";

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
        System.out.println("isStrongPassword = " + isStrongPassword);

    }



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




/*

Write a program that can verify if a pssword is a string pasword.

1- oassword must be at least 8 charac
2- ontain at least 1 uppercase
3 - cpntains at least 1 lowercase
4-contain one special chara
5-contain atleast 1 digit



 */