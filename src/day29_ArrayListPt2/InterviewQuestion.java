package day29_ArrayListPt2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class InterviewQuestion {

    //Question: Find the nth largest number from the array:

            //n=3;

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,7,8,8));


        int n = 3;

        for (int i = 1; i < n ; i++) {
            list.removeIf(p -> Collections.max(list) == p);
        }

        //list.removeIf(p -> Collections.max(list) == p); //2nd max num
        //list.removeIf(p -> Collections.max(list) == p); //3rd max num
        //list.removeIf(p -> Collections.max(list) == p); // 4th max num



        int max = Collections.max(list); // 1st max num


        System.out.println(max);

    }
}
