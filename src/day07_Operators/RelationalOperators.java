package day07_Operators;

public class RelationalOperators {

    public static void main(String[] args) {

        boolean result1 = 20 > 40;

        System.out.println(result1);
        System.out.println("result1 = " + result1);

        System.out.println("----------------------------");

        boolean result2 = 300 >= 150;
        System.out.println(result2);
        System.out.println("result2 = " + result2);

        System.out.println("---------------");

        boolean result3 = 100>= 100;
        System.out.println(result3);
        System.out.println("result3 = " + result3);

        System.out.println("--------------");

        boolean result4 = 300 >= 500;
        System.out.println(result4);
        System.out.println("result4 = " + result4);

        System.out.println("---------------");

        int creditScore = 745;

        boolean isEligibleForLoan = creditScore >= 720;

        System.out.println(isEligibleForLoan);
        System.out.println("-------------------");

        boolean result5 = 100 < 200 ;
        System.out.println(result5);
        System.out.println("result5 = " + result5);
        System.out.println("------------------------");

        boolean result6 = 200 < 180;
        System.out.println(result6);
        System.out.println("result6 = " + result6);
        System.out.println("-----------------");

        int score = 59;
        boolean hasFailed = score <= 59;

        System.out.println(hasFailed);
        System.out.println("hasFailed = " + hasFailed);
        System.out.println("-----------------------");

        boolean result7 = 45 <= 60;
        System.out.println(result7);
        System.out.println("result7 = " + result7);
        System.out.println("---------------------");

        int x = 100;
        int y = 200;
        boolean equal = x == y;
        System.out.println("equal = " + equal);
        System.out.println("------------------");

        boolean result8 = "Muhtar" == "Good Guy";
        System.out.println("result8 = " + result8);
        System.out.println("---------------------");

        boolean result9 = 'A' == 'a';
        System.out.println("result9 = " + result9);
        System.out.println("----------------");

        boolean result10 = "Java" == "Java";
        System.out.println("result10 = " + result10);
        System.out.println("-------------");

        boolean result11 = 100 != 200.5;
        System.out.println("result11 = " + result11);



    }
}
