package day29_ArrayListPt2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Ali", "David", "Ahmed", "Jimmy", "Daniel", "Aaron", "Ahmed", "David", "Shay"));

        employees.retainAll(Arrays.asList("David", "Ahmed"));

        System.out.println("Keep only the names Ahmed and David");
        System.out.println(employees);

        System.out.println("===============================");

        String[] names = {"Mary", "Monica", "Mehray", "Musti", "Sumeray", "Hasan", "Beril"};

        ArrayList<String> list = new ArrayList<>( Arrays.asList(names) );

        list.removeIf(p -> p.startsWith("M")); // or list.removeIf(p -> p.charAt(0) == M );
        System.out.println("Result should remove all names that start with letter M");
        System.out.println(list);


        names = list.toArray(new String[0]);

        System.out.println("");
        System.out.println("Convert string back to original string without the names that start with M");
        System.out.println(Arrays.toString(names));



    }
}
