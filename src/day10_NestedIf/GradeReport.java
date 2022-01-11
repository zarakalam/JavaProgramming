package day10_NestedIf;

public class GradeReport {

    public static void main(String[] args) {

        int score = 87;

        String result = ""; // temporary empty string

        if(score >= 0 && score <=100){

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





    }
}

/*
    90-100 excellent
    80-89 great
    70-79 good
    60-60 passed
    0-59 fail

 */