package day17_DoWhileLoops;

import java.util.Scanner;

public class MarriageProposal {
    public static void main(String[] args) {

        //this one is weird af, can't get it to print goodbye or even accept no as an answer

        Scanner scan = new Scanner(System.in);

        System.out.println("Will you Marry me? Yes/No");
        String answer = scan.next().toLowerCase();


        while ( ! (answer.equals("yes") || answer.equals("no")) ){
            System.out.println("Invalid answer, please re-enter");
            answer = scan.next().toLowerCase();
        }

        if (answer.equals("yes")) {
            System.out.println("Congrats");
        }else{
        System.out.println("Goodbye");

    }

        scan.close();
    }



}
