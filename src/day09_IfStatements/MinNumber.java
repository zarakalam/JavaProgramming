package day09_IfStatements;

public class MinNumber {

    public static void main(String[] args) {

        int n1 = 100,
                n2 = 200;

        boolean n1isMinNumber = n1 < n2;
        boolean n2IsMinNum = n2 < n1;
        boolean equal = n1 == n2;


        if(n1isMinNumber){
            System.out.println(n1 + " is minimum number");
        }

        if(n2IsMinNum){
            System.out.println(n2 + " is minimum number");
        }

        if (equal){
            System.out.println("Equal");
        }

    }
}

/*
1. Create a class called MinNumber, Write a program that can print the minimum number between two numbers, if both are equal then print Equal

            Ex:
                n1= 100, n2 = 200;

            output:
                100 is the minimum number
 */