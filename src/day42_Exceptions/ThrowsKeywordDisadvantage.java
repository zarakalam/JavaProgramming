package day42_Exceptions;

public class ThrowsKeywordDisadvantage {

    public static void main(String[] args) {

        System.out.println("Hello");

        // sleep(2.5); // throws;

        System.out.println("hello world");

        System.out.println("---------------------------");

        System.out.println("hello");

        MorningWorkout.sleep(2.5); // try and catch

        System.out.println("Cydeo");


    }

    public static void sleep(double seconds) throws InterruptedException {

            Thread.sleep( (long) (seconds * 1000) );

    }
}
