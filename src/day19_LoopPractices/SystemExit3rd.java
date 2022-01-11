package day19_LoopPractices;

public class SystemExit3rd {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            if(i==3){
                //break; terminates sequence afer printing 0,1,2
                //continue;  skips the number 4 and prints 0,1,2,4
                System.exit(0); // once condition is true, it terminates the ENTIRE program..will not print wooden spoon
            }

            System.out.print(i + " ");

        }

        System.out.println("Wooden Spoon");
    }
}
