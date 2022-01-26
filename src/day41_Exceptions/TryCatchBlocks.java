package day41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks {

    public static void main(String[] args) {

        System.out.println("Test Started");

        try {

            System.out.println(9 / 0);

            System.out.println("Try block");

        }catch(ArithmeticException e){

            System.out.println("catch block");
            System.out.println("Arithmetic Exception is caught");

        }

        System.out.println("Test Completed");

        System.out.println("========================================");

        System.out.println("test 2 started");

        int[] numbers = {1,2,3,4,5};

        try {

            System.out.println(numbers[200]);

            System.out.println("Try block");

        }catch (ArrayIndexOutOfBoundsException e){ // or you can write in 'RuntimeException e'

           /*
            System.out.println("catch block");
            System.out.println("Array Index Out Of Bounds Exception occurred");

            */
           // e.printStackTrace();
            System.out.println(e.getMessage());
        }


        System.out.println("test 2 completed");
        System.out.println("===================================================");


        System.out.println("Test 3 started");


        System.out.println("Test 3 Completed");

        System.out.println("=================================================");

        System.out.println("Hello");

        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Cydeo");

        System.out.println("=========================");

        try {
            FileInputStream file = new FileInputStream("File Path");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }











    }



}
