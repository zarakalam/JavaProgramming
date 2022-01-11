package day30_CustomClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTasks {

    public static void main(String[] args) {

        //1. write a program that can swap the first and last elements of an ArrayList of Integers

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8));

        Collections.swap(list, 0, list.size()-1);

        System.out.println("");
        System.out.println("swap the first and last elements of an ArrayList of Integers");
        System.out.println(list);

        System.out.println("====================================================================");


        /*

        Write a program that can move all the zeros to the last indexes of ArrayList

                    Ex:
                        list: {1,0,2,0,3,0,4,0}

                    output:
                        [1, 2, 3, 4, 0, 0, 0, 0]

         */

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll( Arrays.asList(1,0,2,0,3,0,4,0) );

        int length = list1.size();  //find the lenght of the array with the zeros

        list1.removeAll( Arrays.asList(0) ); // now remove the zeros

        int newLength = list1.size();  //this is the new lenght w/o zeros
        int totalNumOfZeros = length-newLength;   // this will tell you how many zeros were taken out, print out variable total#0's to get answer

        for (int i = 0; i < totalNumOfZeros; i++) {    //creat a fori loop that equals the number of 0's extracted
            list1.add(0);     // put the name of the array list followed by the number you are adding to the end ... i.e 0 in this case
        }



        System.out.println("move all the zeros to the last indexes of ArrayList");
        System.out.println();
        System.out.println(list1);   // print out statement to see the numbers at the end of the array.




        System.out.println("====================================================================");

        //3. Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters

        String str = "ABCD123$%#@&456EFG!";

        ArrayList<Character> chars = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i));
        }


        ArrayList<Character> letters = new ArrayList<>( chars );
        letters.removeIf(p -> !Character.isLetter(p));
        System.out.println("letters = " + letters);

        ArrayList<Character> digits = new ArrayList<>( chars );
        digits.removeIf(p -> !Character.isDigit(p));
        System.out.println("digits = " + digits);

        ArrayList<Character> specialChar = new ArrayList<>( chars );
       specialChar.removeIf(p -> Character.isLetterOrDigit(p));
        System.out.println("specialChar = " + specialChar);
        /*

        specialChar.removeAll(letters);
        specialChar.removeAll(digits);
        System.out.println("specialChar = " + specialChar);

         */








    }



}

/*


1. write a program that can swap the first and last elements of an ArrayList of Integers

2. Write a program that can move all the zeros to the last indexes of ArrayList

                    Ex:
                        list: {1,0,2,0,3,0,4,0}

                    output:
                        [1, 2, 3, 4, 0, 0, 0, 0]


3. Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
                Ex:
                    str = "ABCD123$%#@&456EFG!"

                output:
                    list1: {1, 2, 3, 4, 5, 6}
                    list2: {A, B, C, D, E, F, G}
                    list3: {$, %, #, @, &, !}






 */