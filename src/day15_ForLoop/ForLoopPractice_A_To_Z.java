package day15_ForLoop;

public class ForLoopPractice_A_To_Z {
    public static void main(String[] args) {

        for(char i = 'A'; i<= 'Z'; i+=1){
            System.out.print(i + " ");
        }
        System.out.println("\n" + "==========================");

        for(char i = 'a'; i <= 'z' ; i+=1)
            System.out.print(i + " ");
        System.out.println("\n" + "=================================");

        for(char i = 'Z'; i >= 'A' ; i-=1){
            System.out.print(i + " ");
        }
        System.out.println("\n" + "===================================");

        for(char i = 'z'; i >= 'a' ; i-=1){
            System.out.print(i + " ");
        }
        System.out.println("\n" + "=============================================");

        //print first 40k char characters

        for(char i = 1; i <= 40000; i +=1){
            System.out.print(i + " ");
        }

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");



    }
}
