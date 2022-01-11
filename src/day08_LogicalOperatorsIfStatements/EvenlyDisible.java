package day08_LogicalOperatorsIfStatements;

public class EvenlyDisible {

    public static void main(String[] args) {

        int number = 65;

        boolean divisbleBy2 = number % 2 == 0;
        boolean divisbleBy3 = number % 3 == 0;
        boolean divisbleBy5 = number % 5 == 0;

        System.out.println(number + " is divisible by 2: " + divisbleBy2);
        System.out.println(number + " is divisible by 3: " + divisbleBy3);
        System.out.println(number + " is divisible by 5: " + divisbleBy5);





    }
}
/*
2. Create a class called EvenlyDivisible, and write a program that can check if a number is evenly divisible by 2, 3, 5
            Ex:
                number = 65;

            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true
 */