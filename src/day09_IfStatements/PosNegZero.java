package day09_IfStatements;

import javax.sound.midi.Soundbank;

public class PosNegZero {

    public static void main(String[] args) {

        int num = 100;


        if (num > 0) {
            System.out.println("Positive");
        }
        if (num < 0) {
            System.out.println("Negative");
        }

        if (num == 0) {
            System.out.println("Zero");
        }

        System.out.println("-----------------------");

        boolean positive = num > 0;
        boolean negative = num < 0;
        boolean zero = num == 0;

        if(positive) {
            System.out.println("Positive");
        }else if(negative) {
            System.out.println("negative");
        }else{
            System.out.println("Zero");
        }

    }

}
