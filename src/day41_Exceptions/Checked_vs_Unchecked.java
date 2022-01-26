package day41_Exceptions;

import day39_Recap.cydeoTask.Student;

import java.io.FileInputStream;

public class Checked_vs_Unchecked {


    public static void main(String[] args) {

        //unchecked exception: occurs during the run time

        int a = 10 ;
        int b = 0;

       /*
       System.out.println( a / b ); due to the exception you can no longer run any other test programs

       System.out.println("Wooden Spoon"); this print statement will not print due to the exception in the line above
        */


      char[] characters = {'A', 'B', 'C'};

       // System.out.println( characters[99] );


        Student student = null;

       /*
        System.out.println( student.getName());
        System.out.println( student.study();

        */

        final String str = "Wooden Spoon";

        /*
        str = null;

        System.out.println( str.toUpperCase() );

         */

        String str2 = "";

        System.out.println(str2.isEmpty());




        //Checked Exception: occurs during the compile time, while writing code

        System.out.println("Hello");

        // Thread.sleep(2000);  <---- checked exception example

        System.out.println("Cydeo");

        // FileInputStream file = new FileInputStream("path of the file"); <----- checked exception example

       // System.out.println("java".charAt(20000)); <----- unchecked exception example













    }





}
