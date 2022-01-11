package day08_LogicalOperatorsIfStatements;

public class EligibleToVote {

    public static void main(String[] args) {

        String name = "Josh";
        int age = 38;
        String citizenship = "USA";

        //eligible to vote or not... so     2 POSSIBLE OUTCOMES

        boolean isEligible = age >=21 && citizenship == "USA"; //both statements need to be true to print out true bc of LOGICAL AND Op.

        //eligible
        if (isEligible){
            System.out.println("Eligible");
        }

        //not eligible

        if (!isEligible){
            System.out.println("Not Eligible");
        }



    }
}
