package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1_4th {

    public static void main(String[] args) {

    ArrayList<Integer> numbers = new ArrayList<>();

        //add method: used to add to the array list:

        numbers.add(10); //0
        numbers.add(20); //1
        numbers.add(30); //2
        numbers.add(40); //3
        numbers.add(50); //4

        numbers.add(2,25);

        System.out.println(numbers);
        System.out.println("==============================");

        //Size() method returns the total number of the elements

        System.out.println(numbers.size() );

        int lastIndex = numbers.size() - 1; //last index # in the array list

        System.out.println("lastIndex = " + lastIndex);

        System.out.println("===================================");

        //get() method: returns given element at given index.

       Integer num = numbers.get(3);
        System.out.println(num);
        System.out.println("==================================");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println( numbers.get(i) );
        }

        System.out.println("=======================================");


        //set method(index, data) -- replaces the element at the given index with the new element:

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C#");
        list.add("Ruby");
        list.add("Java");
        System.out.println(list);

        list.set(2,"C++");
        list.set(4,"JavaScript");
        System.out.println(list);



    }





}
