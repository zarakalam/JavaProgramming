package day40_FinalKeyword;

public class FinalVariable {

    final String birthday;
    final static String name;

    static{
        name= "batch 25";
    }

    public FinalVariable(String birthday) {
        this.birthday = birthday;
    }

    public static void main (String[] args) {

        final double pi = 3.14;

       /*
        pi= 4.14; //final variable cannot be reassigned

        pi = 5.4;

        */

        final String name;

        name = "java";

        System.out.println(name);

        System.out.println("-------------------------------------");




        FinalVariable obj = new FinalVariable("may/01");

       // obj.birthday= "June/01"; // err due to final access modifier
        System.out.println(obj.birthday);




    }
}
