package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods2_6th {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        Integer num = 200;
        list.remove(num);
        System.out.println(list);
        System.out.println("========================================");


        //clear method removes all elements in the array list... do not need to enter an argument

        System.out.println(list.size()); // size was 5

        list.clear();  //-------->> clear method.

        System.out.println(list.size()); // size should now return 0
        System.out.println(list); // array should be empty
        System.out.println("===================================================");

        //index of and last index of method :
        //index of will give u the index of the given element
        //lat index will give you the last elements index.
        ArrayList<Character> charcters = new ArrayList<>();

        charcters.add('A');
        charcters.add('A');
        charcters.add('A');
        charcters.add('A');
        charcters.add('A');

        int a = charcters.indexOf('A'); // returns 0
        int b = charcters.lastIndexOf('A'); //returns 4

        System.out.println("a = " + a);
        System.out.println("b = " + b);


        //contains method:

        boolean r1 = charcters.contains('A');
        boolean r2 = charcters.contains('Z');

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);

        System.out.println("=========================================");

        //equals method:


        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1.equals(list2));

        System.out.println("======================================");


    }
}
