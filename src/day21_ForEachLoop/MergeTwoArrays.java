package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {

        String[] group1 = {"Ali", "Layan", "Aysenur"};
        String[] group2 = {"Maria", "Aygun", "Duygu", "Suat", "Valeriy"};

        String[] students =new String[group1.length + group2.length];

        int i =0;
        for (String each : group1) {
            students[i++] = each;
        }

        for (String each : group2) {
            students[i++] = each;
        }

        System.out.println(Arrays.toString(students));
        System.out.println("==============================");

        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'D', 'E', 'F', 'G', 'H'};

        char[] ch3 = new char[ch1.length + ch2.length];

        int j =0;
        for (char ch : ch1) {
            ch3[j]=ch;
            j++;
        }

        for (char ch : ch2) {
            ch3[j]= ch;
            j++;
        }

        System.out.println(Arrays.toString(ch3));


    }
}
/*

write a program to merge two arrays
ex
arr1 {1,2,3,4}
arr2 {5,6}

output:
arr3 {1,2,3,4,5,6}

 */