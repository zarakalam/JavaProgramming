package day23_CustomArrayMethods;

public class CustomMethodTwo2nd {

    //create a function thatll print hello world 5x

    // create a function thstll print out hello cydeo 5x

    public static void main(String[] args) {
        System.out.println("Test Started");

        helloWorld();
        helloCydeo();

        System.out.println("test complete");

    }

    public static void helloWorld(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");

        }
    }

    public static void helloCydeo(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo!");

        }
    }
}
