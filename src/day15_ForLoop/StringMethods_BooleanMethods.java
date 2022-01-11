package day15_ForLoop;

public class StringMethods_BooleanMethods {
    public static void main(String[] args) {

        String str = ""; // string is currently empty, bc no text or spaces etc.. nothing except double quotes

        boolean r= str.isEmpty(); // will result in true or false.

        System.out.println("r = " + r);

        //String method "isBlank"

         String str1 = " ";
         boolean r1 = str1.isBlank(); // true bc above string has a space, it will print true as well if meets isEmpty criteria
        System.out.println("r1 = " + r1);


        String str2 = "Cydeo      ";
        boolean r2 = str2.isBlank(); //will return false due to text/characters being present.
        System.out.println("r2 = " + r2);

        System.out.println("===========================");

        //String Method : equals

        String s1 = "CYDEO";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2));

        //String Method equalsIgnoreCase

        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println("=================================");

        //String Method : contains()

        String sentence = "My favorite programming language is Java";

        boolean containsCsharp = sentence.contains("C#");
        System.out.println(containsCsharp);
        boolean hasJava = sentence.contains("Java");
        System.out.println(hasJava);
        boolean hasJava3 = sentence.toLowerCase().contains("java");// made entire sentence lower case making the contains staement true
        System.out.println(hasJava3);
        System.out.println("=================================");


        String input1 = "I love Java";
        String input2 = "Java";

        System.out.println(input1.equals(input2)); // false.... test its in entirety
        System.out.println(input1.equalsIgnoreCase(input2)); // still false , input 2 is shorter
        System.out.println(input1.contains("Java")); // true

        /*
        to ignore case sensitivty make it all upper or lower case then add contains
        input1.toUpperCase.contains() or input1.toLowerCase.contains()
         */

        System.out.println("=============================================");

        //String Method startsWith()

        String a = "Wooden Spoon";
        boolean x= a.startsWith("W");
        System.out.println(x);
        boolean y = a.startsWith("oo");
        System.out.println(y);

        System.out.println("====================");

        //String Method endsWith()

        boolean z = a.endsWith("n");
        System.out.println(z);
        System.out.println("**************************************");
        boolean xy= a.toLowerCase().startsWith("wooden");
        System.out.println(xy);




    }
}
