package day29_ArrayListPt2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtility {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,9,8,7,6,5,4,3,2,1));

        Collections.sort(list);
        System.out.println(list);
        System.out.println("=========================");

        ArrayList<Character> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList('a', 'b', 'c', 'd', 'e'));

        Collections.reverse(list2);
        System.out.println(list2);
        System.out.println("==============================");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(10,20,30,40,50,60,70));

        Collections.swap(list3,1,4);

        System.out.println(list3);

        int max = Collections.max(list3);
        int min = Collections.min(list3);

        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("=============================");

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(10,20,30,40,50,10,10,10));
        Collections.replaceAll(list4,10,1000);
        System.out.println(list4);

        System.out.println("");

        int freq= Collections.frequency(list4,1000);

        System.out.println(freq + "\t" + "<------   frequency of the # 1,000");

        System.out.println("=================================");

        ArrayList<String> word = new ArrayList<>();
        word.addAll(Arrays.asList("Java", "Java", "Python", "Python", "Ruby", "C#"));

        int countJava = Collections.frequency(word,"Java");
        int countPython = Collections.frequency(word, "Python");

        boolean result = countJava == countPython;

        System.out.println(result + "\t" + "<-------  checked to see if the word Java and Python appear the same amount of time");




    }
}
