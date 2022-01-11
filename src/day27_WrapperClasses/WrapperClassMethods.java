package day27_WrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {

        String str = "123";

        int num = Integer.parseInt(str); // prints the string as an int.

        System.out.println(num + 1);

             System.out.println("==================================");

        String str2 = "10.5";

        double num2 = Double.parseDouble(str2); // prints the string as a double

        System.out.println(num2);

             System.out.println("==================================");

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println("min = " + min);
        System.out.println("max = " + max);

             System.out.println("=====================================");

        long max2 = Long.MAX_VALUE;
        long min2 = Long.MIN_VALUE;

        System.out.println("min2 = " + min2);
        System.out.println("max2 = " + max2);

            System.out.println("=================");

        String str3 = "True";

        boolean r1 = Boolean.parseBoolean(str3);
        System.out.println("r1 = " + r1);

            System.out.println("========================");

        String s1 = "123";
        Integer x = Integer.valueOf(s1); // will also print the string as an int
        //int y = Integer.valueOf(s1); either way works
        System.out.println(x);

            System.out.println("=======================");

        String s3 = "10.5";
        double z = Double.valueOf(s3); // will also print the string as a double.
        //Double z = Double.valueOf(s3);
        System.out.println(z);

             System.out.println("============================");

        char ch = '4';

        //is Digit:
        boolean r2 = Character.isDigit(ch);

        //is Letter:
        boolean r3 = Character.isLetter(ch);


        char ch1 = '$';
        boolean r4 = !Character.isLetterOrDigit(ch1);//


        System.out.println(r2); //would become false if the char was a letter
        System.out.println(r3); // this will become true if the char was a letter i.e a, A etc
        System.out.println(r4); // will state if the character is a special char or not
              System.out.println("============================");

        char ch2 = 'A';

        //uppercase:
        boolean r5 = Character.isUpperCase(ch2);// would be false if character was lowercase

        char ch3 = 'z';
        //lowercase:
        boolean r6 = Character.isLowerCase(ch3); // is true bc character is lower case, would be false if uppercase

        System.out.println("r5 = " + r5);
        System.out.println("r6 = " + r6);
             System.out.println("==========================================");

        //print the sum of the following string-------> answer: 10

        String s = "ab1cde2efg3hi4";

        // solution process:

        int sum = 0;

        for (char each : s.toCharArray()) { // created a char array in order to be able to print each element of the string
            if (Character.isDigit(each)) { //if statement created to state "if element in the string is a digit, then...
                sum += Integer.parseInt("" + each); //... then assign the element to the sum of int.
            }

        }

        System.out.println("sum = " + sum);

    }

}
