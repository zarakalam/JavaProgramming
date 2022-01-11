package day10_NestedIf;

public class GradeReport2 {
    public static void main(String[] args) {

        int score = 89;

        String result = ""; // temporary empty string

        /*if(score >= 0 && score <=100){

            if(score >=90) { // dont need to add the 2nd condition of 100 due to invalid nested if
                result = "Excellent";
            }else if(score >=80 && score <=89) {
                result = "Great";
            }else if(score >=70 && score <= 79) {
                result = "Good";
            }else if(score >=60 && score <= 69) {
                result = "Passed";
            }else{
                result = "Failed";
            }


        }else{
            result = "Invalid Score";
        }

        System.out.println(result);

         */
        System.out.println("--------------------------");

        //print above task as Ternary:

        String result1 = (score >= 0 && score <= 100)? (score >=90)? "Excellent" :(score >=80)? "Great" :(score >= 70)? "Good"
                :(score >=60)? "Passed" : "Failed" : "Invalid Score";

        System.out.println(result1);

    }
}
