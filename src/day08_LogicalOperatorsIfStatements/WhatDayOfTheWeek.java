package day08_LogicalOperatorsIfStatements;

public class WhatDayOfTheWeek {

    public static void main(String[] args) {

        int day = 1;

        boolean a = day == 1;
        boolean b = day == 2;
        boolean c = day == 3;
        boolean d = day == 4;
        boolean e = day == 5;
        boolean f = day == 6;
        boolean g = day == 7;

        if (a){
            System.out.println("Monday");
        }

        if (b){
            System.out.println("Tuesday");
        }

        if (c){
            System.out.println("Wednesday");
        }

        if (d){
            System.out.println("Thursday");
        }

        if (e){
            System.out.println("Friday");
        }

        if (f){
            System.out.println("Saturday");
        }

        if (g){
            System.out.println("Sunday");
        }


    }
}
