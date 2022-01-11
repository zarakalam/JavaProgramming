package day11_Switch_Scanner;

public class GradeReportSwitch {

    public static void main(String[] args) {

        char grade = 'B';
        String result = "";

        switch (grade){

            case 'A':
                result = "excellent";
                break;
            case 'B':
                result = "great job";
                break;
            case 'C':
                result = "good";
                break;
            case 'D':
                result = "passed";
            case 'F':
                result = "failed";
            default:
                result = "invalid";
        }
        System.out.println(result);


    }

}
