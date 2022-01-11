package day08_LogicalOperatorsIfStatements;

public class SingleIfStatementsIntro {

    public static void main(String[] args) {

        int number = 300;

        boolean evenNumber = number % 2 == 0 ;

        if(evenNumber){
            System.out.println(number + " is an even number");

        }
        System.out.println("-------------------");

        int n = 200;
        //positive
        if(n > 0){
            System.out.println(n + " is positive");

        }
        //negative
        if(n < 0){

            System.out.println(n + " is negative");

        }
        //zero
        if(n == 0){
            System.out.println(n + " is zero");
        }
            // only statement which is true will be printed.



    }
}
