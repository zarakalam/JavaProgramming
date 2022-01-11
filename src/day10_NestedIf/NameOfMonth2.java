package day10_NestedIf;

public class NameOfMonth2 {
    public static void main(String[] args) {

        int month = 7;
        String result = "";


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

        System.out.println(result);


        System.out.println("-----------------------------------");


        String result1 = (month == 1)? "January" :(month == 2)? "February" :(month == 3)? "March" :(month == 4)? "April"
                :(month == 5)? "May" :(month == 6)? "June" :(month == 7)? "July" :(month == 8)? "August"
                :(month == 9)? "September" :(month == 10)? "October" :(month == 11)? "November"
                : "December";

        System.out.println(result1);







    }
}
