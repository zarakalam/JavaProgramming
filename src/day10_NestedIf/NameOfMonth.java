package day10_NestedIf;

public class NameOfMonth {

    public static void main(String[] args) {

        // only have 1 print statement.
        // i tested the system and it all works =).

        int month = 3;
        String result = "";
        // line 14 you can hide all the if,else if statements to make things readable

        if(month >=1 && month <=12){ //start of nested if

            if(month == 1) {
                result = "January";
            }else if(month == 2){
                result = "February";
            }else if(month == 3){
                result = "March";
            }else if(month == 4) {
                result = "April";
            }else if(month == 5){
                result = "May";
            }else if(month == 6) {
                result = "June";
            }else if(month == 7){
                result = "July";
            }else if(month == 8) {
                result = "August";
            }else if(month == 9){
                result = "September";
            }else if(month == 10){
                result = "October";
            }else if(month == 11) {
                result = "November";
            }else {
                result = "December";
            }


        }else{    //end of nested if statement
            result = "Invalid Month";
        }

        System.out.println(result); // ALWAYS make sure that this statement is at the end of the NESTED IF
    }
}
