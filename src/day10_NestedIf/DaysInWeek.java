package day10_NestedIf;

public class DaysInWeek {
    public static void main(String[] args) {

        int n = 5;
        String num = "";

        if(n== 1){
            num = "Monday";
        }else if(n == 2){
            num = "Tuesday";
        }else if(n == 3){
            num = "Wednesday";
        }else if(n == 4) {
            num = "Thursday";
        }else if(n == 5){
            num = "Friday";
        }else if( n == 6){
            num = "Saturday";
        }else{
            num = "Sunday";
        }

        System.out.println(num);

        System.out.println("-----==============");

        String result1 = (n == 1)? "Monday" :(n == 2)? "Tuesday" :(n == 3)? "Wednesday" :(n==4)? "Thursday"
                         :(n == 5)? "Friday" :(n == 6)? "Saturday " : "Sunday";

        System.out.println(result1);


    }
}
