package day11_Switch_Scanner;

public class NumberOfDaysInAMonth {
    public static void main(String[] args) {

        int month = 5;
        int year = 2021;
        String result = "";

        if(month >=1 && month<= 12){


        switch (month){

            case 2:
                result = (year % 4 == 0)? "29 days" : "28 days";
                break;

            case 4: case 6: case 9: case 11:
                result = "30 Days";
                break;
            default:
                result = "31 Days";
        }

        }else{
            result = "Invalid Number";
        }

        System.out.println(result);


    }
}
