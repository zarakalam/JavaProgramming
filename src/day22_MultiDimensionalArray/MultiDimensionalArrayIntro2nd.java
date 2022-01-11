package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro2nd {
    public static void main(String[] args) {

        //when u dont know the exact arrays in a multi dim array

        String[] group1 = {"Jon", "Jaxon", "james"};
        String[] group2 = {"Aaron", "Shay", "Breanna"};
        String[] group3 = {"Zarak", "Morgan", "Zaiden"};

        String[][] groups = new String[3][];//0,1,2

        groups[0]=group1;
        groups[1] =group2;
        groups[2] = group3;

        System.out.println(Arrays.deepToString(groups));
        System.out.println("=================================");

        //when the arrays are known for multi dim array

  //index of the elements: 0 1 2    0 1 2 3    0 1 2  3  4
        int[][] arr2D = { {1,2,3}, {4,5,6,7}, {8,9,10,11,12} };
                //index      0         1            2

        System.out.println(Arrays.deepToString(arr2D));
        System.out.println("================================");

        //print out 2nd set of arrays

        System.out.println(Arrays.toString(arr2D[1]));
        System.out.println("================================");

        //print out element 11 from the 3rd set of array

        System.out.println( arr2D[2][3]  );
        System.out.println("================================");










    }
}



