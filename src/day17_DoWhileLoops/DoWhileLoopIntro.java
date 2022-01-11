package day17_DoWhileLoops;

public class DoWhileLoopIntro {
    public static void main(String[] args) {

        boolean a = false;

        // for loop example:
        for (int i = 0; a;){
            System.out.println("Wooden Spoon --for loop");

        }

        System.out.println("=============================");
        //While loop example:

        while(a){
            System.out.println("Wooden Spoon");
        } // statement will never get executed because it is false.
        System.out.println("===============================");

        //Do while loop example:

        do{
            System.out.println("Wooden Spoon");
        }while(a); /* if condition is true the do block will be ran over and over again...
                      if it is false then it will still print wooden spoon but then it will not run again
                      */




    }
}
