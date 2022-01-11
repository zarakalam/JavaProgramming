package day08_LogicalOperatorsIfStatements;

public class LogicalOperator {

    public static void main(String[] args) {

        String name = "Aaron";
        int age = 18;
        String citizen = "USA";

        boolean isEligible = age >= 18 && citizen == "USA"; // with logical AND operator (&&) both statements must be true in order to print true.

        System.out.println(name + " is eligible to vote: " + isEligible);

        // created when needed to find out if something meets certain requirements
        System.out.println("-----------------------------");

        String name2 = "Josh";
        int creditScore = 800;
        int age2 = 42;
        int income = 58000;

        //credit score >= 700 and age must be >=21

        boolean isEligible2 = creditScore >= 700 && age2 >=21 && income >=60000;

        System.out.println(name2 + " is eligible for loan: " + isEligible2);

        System.out.println("---_________________-------");

        String name3 = "Shay";

        int age3 = 21;
        char gender = 'F';

        boolean isEligible3 = age3 >= 18 && (gender == 'M' || gender == 'F');

        System.out.println(isEligible3);

        System.out.println("-----------------------------");

        String name4 = "James";

        String countryOfBirth = "UK";

        boolean marriedToUSCitizen = false;

        System.out.println("----------------------------");

        int score = 55;
        boolean passed = score >= 60;
        boolean failed = !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);
        System.out.println("----------------------------------");




    }



}

/*

&& = BOTH , "logical and" operator - both must be true in order to out put TRUE
|| = EITHER , "logical either/or" operator - both must be false in order to output FALSE

 */