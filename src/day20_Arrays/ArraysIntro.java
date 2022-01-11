package day20_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        //contain a variable which can contain 5 names (data you dont know)
        String[] myGroups = new String[5];
        myGroups[0]= "Gunay";
        myGroups[1]= "Neira";
        myGroups[2]= "Suat";
        myGroups[3]= "Hulya";
        myGroups[4]= "Mikael";
        System.out.println(Arrays.toString(myGroups));
        System.out.println("===============================");

        // data you already know and want the system to exit if invalid number

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(Arrays.toString(days));

        int number = 5;

        if(number<1 || number>7){
            System.err.println("invalid number");
            System.exit(0);
        }

        System.out.println(days[number-1]);
        System.out.println("=======================");

        //write a code that prints out the name of the month, given an integer... if int is in an invalid month, exit the system.

        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
                            "October", "November", "December"};
        System.out.println(Arrays.toString(month));

        int num1 = 7;

        if(num1<1 || num1 >12){
            System.err.println("Invalid Month entry");
            System.exit(0);
        }
        System.out.println(month[num1-1]);



    }
}
