package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChars {
    public static void main(String[] args) {

        String str = "Cydeo12345School!@#$%WoodenSpoon";

        //12345
        //CydeoWoodenSpoon
        //!@#$%

        String digits = "";
        String letter = "";
        String specialChar = "";

        //  vvv - First step is to always get sys to print out all of characters
        for (int i = 0; i <= str.length()-1; i++) { //i: index # of str from 0 to last index
            char ch = str.charAt(i); // ch: each character that we have in the str

         // vvv - Second step, create your if statement

            if(ch >= '0' && ch <= '9'){
                digits += ch;
            }else if(ch >= 'A' && ch <= 'Z'){
                letter += ch;
            }else if (ch >= 'a' && ch <= 'z'){
                letter += ch;
            }else{
                specialChar += ch;
            }


        }

        //vvv - Third step print out all digits letters and special char

        System.out.println("digits = " + digits);
        System.out.println("letter = " + letter);
        System.out.println("specialChar = " + specialChar);

    }
}
