package day11_Switch_Scanner;

public class GradeLevel {
    public static void main(String[] args) {

        int gradeLevel = 9;
        String result = "";

        if(gradeLevel >= 1 && gradeLevel <=18){

            switch (gradeLevel){

                case 1:  // multiple case blocks can be printed on one line (see below ex)
                case 2:  // case 1: case 2: etc. all can be on one line, next line would have result =__;
                case 3:  // and line after would have break;
                case 4:
                case 5:
                    result = "Elementary School";
                    break;
                case 6:
                case 7:
                case 8:
                    result = "Middle School";
                    break;
                case 9:
                case 10:
                case 11:
                case 12:
                    result = "High School";
                    break;
                case 13:
                case 14:
                case 15:
                case 16:
                    result = "College";
                    break;
                default:
                    result = "Grad School";

            }


        }else{
            result = "Invalid grade level given";
        }

        System.out.println(result);



    }
}
/*
1. Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            Note:
                Solution 1: Use switch statement
                Solution 2: use if & switch both
 */