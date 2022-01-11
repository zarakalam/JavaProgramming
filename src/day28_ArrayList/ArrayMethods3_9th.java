package day28_ArrayList;

import java.util.ArrayList;

public class ArrayMethods3_9th {

    public static void main(String[] args) {

        //isEmpty method:

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1.equals(list2));
        System.out.println("==========================================");

        list1.clear();
        boolean isEmpty = list1.isEmpty();
        System.out.println(isEmpty);





    }
}
