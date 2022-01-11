package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice_5th {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);


        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) *2);

        }

        System.out.println(list);

        System.out.println("========================");


        //remove method int, index type: removes the element at the given index and makes the array shorter by 1

        ArrayList<String> employees = new ArrayList<>();

        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Kaloyan");
        System.out.println(employees);


        employees.remove(0);
        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);

        employees.remove(1);
        System.out.println(employees);

        employees.remove(employees.size()-1);
        System.out.println(employees);

        System.out.println("=======================");

        //remove method Object type

        employees.remove("Hulya"); // you can assign this to a boolean variable
        //boolean r1 =  employees.remove(o: "Hulya");
        System.out.println(employees);

        employees.remove("Neira");
        System.out.println(employees);

        //System.out.println(r1);

    }



}

/*

multiple every element by 2 in the array.


 */
