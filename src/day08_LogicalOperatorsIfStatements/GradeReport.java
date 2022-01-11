package day08_LogicalOperatorsIfStatements;

public class GradeReport {

    public static void main(String[] args) {

        /*
       System.out.println( true == !false); //true
        System.out.println( !true != false ); //false
        System.out.println( !false == true); //true

        System.out.println(!!false); //false
        System.out.println(!!!true); //false

         */

        int score = 85;

        boolean a = score >= 90 && score < 100;
        boolean b = score >= 80 && score <= 89;
        //boolean b = score >= 80 && !a;   ---- different way to write boolean b
        boolean c = score >=70 && score <= 79;
        //boolean c = score >=70 && !b && !a;
        boolean d = score >= 60 && score <= 69;
        //boolean d = !a && !b && !c && score >=60;
        boolean hasFailed = score >=0 && score <=59;
        //boolean f = !a && !b && !c && !d;

        if (a){
            System.out.println("Excellent");
        }

        if (b){
            System.out.println("Great");
        }

        if (c){
            System.out.println("Good");
        }

        if (d){
            System.out.println("Passed");
        }

        if (hasFailed){
            System.out.println("Fail");
        }


    }
}


/*

    90 ~ 100 ==> Excellent
    80 ~ 89 ==>  Great
    70 ~ 79 ==>  Good
    60 ~ 69 ==>  Passed
    0 ~ 59 ==>   Fail

 */