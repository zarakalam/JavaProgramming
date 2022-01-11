package day23_CustomArrayMethods;

public class EligibleToVote {

    public static void main(String[] args) {

        eligibleToVote(18, "yes");

    }


    public static void eligibleToVote(int age, String citizenship){

        if(age>=18 && citizenship.equalsIgnoreCase("yes")){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }
    }

}
