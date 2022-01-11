package day04_Variables;

public class PrimativeIntro {

    public static void main(String[] args) {

        // age: 38 years old

        byte age = 38;

        // weight: 160 pounds

        //   byte weight = 160; // 160 is out of byte range

        short weight = 160; // 160 is within the range of short

        //salary: 100000 $
        //short salary = 100000; // 100000 is out of shorts range

        int salary = 100_000; // <-- preferred primitive data type for integer numbers (int)

        long asset = 3_333_333_333L;

        //tax rate: 0.26

        float tax = 0.26F; // in order to force compiler to take float add Upper case F (lower will be accepted)

        double PI = 3.14; // preferred primitive data type for decimals is double

        // #
        char ch1 = '#';
        System.out.println("ch1 = " + ch1);  //this print statement was used using soutv

        char ch2 = 35;
        System.out.println("ch2 = " + ch2);

        char ch3 = 35000;
        System.out.println("ch3 = " + ch3);

        char gender = 'F';

        char grade = 'F';

        char yesNo = 'Y';

        System.out.println(yesNo);

        boolean isEmployeed = true;
        boolean isMarried = false;

        boolean result = 100 > 300 ;


        System.out.println("salary = " + salary);

        String message = "I am a Cybertek school student.";

        System.out.println("message = " + message);

       








    }



}
