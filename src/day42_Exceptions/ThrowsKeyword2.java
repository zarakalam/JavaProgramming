package day42_Exceptions;

public class ThrowsKeyword2 {

    /*
    no need for throws keyword on unchecked exceptions, best practice to use try and catch block
     */

    public static void main(String[] args) {

        System.out.println("Test started");

        System.out.println(8/0);

        System.out.println("test completed");


    }
}
