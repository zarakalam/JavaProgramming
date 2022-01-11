package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListIntro_3rd {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();  //array list data type cannot be primitive i.e int, have to use wrapper class i.e Integer
                                                                // 2nd time adding Integer is optional and not mandatory, but must be the same as whatever the data type is
        ArrayList<String> words = new ArrayList<>();        //as mentioned above, dont need to add String again at the end.


        System.out.println(numbers);
        System.out.println(words);       // benefit of array list is that you dont need to call Array.Util class and select toString() etc to print...



    }





}
