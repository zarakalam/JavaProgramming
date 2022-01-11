package day14_StringClassCont;

public class StringMethod1 {

    public static void main(String[] args) {

        // String trim method:

        String str1 = "      batch 25     "; // wide spaces are before or after string not spaces in between, trim method removes wide spaces
        str1= str1.trim(); // it will now print "batch 25"

        System.out.println(str1);
        System.out.println("--------------------------------");

        //String Index method:

        String str2 = "Cydeo School";
        int n1 = str2.indexOf("h"); // will return index # of the letter as int... must assign it as int
        System.out.println("n1 = " + n1);

        int n2= str2.indexOf("ool"); // in order to get the index value of the second 'o' enter a few letters in front of it
        System.out.println("n2 = " + n2);
        System.out.println("---------------------------------");

        //pract ex:

        String str3 = "Java Programming language";
        int n3 = str3.indexOf("amm");
        System.out.println("n3 = " + n3);

        //prac ex 2: index value of first G

        int n4 = str3.indexOf("g");
        System.out.println("n4 = " + n4);

        // to find the last index value of the g utilize lastIndexOf

        int n5 = str3.lastIndexOf("g");
        System.out.println("n5 = " + n5);
        System.out.println("-------------------------------------------");

        // prac 3;

        String s = "Java Nova Cava Wawa orange";
        int firstA = s.indexOf("a");
        System.out.println("firstA = " + firstA);
        int lastA = s.lastIndexOf("a");
        System.out.println("lastA = " + lastA);
        int secondA = s.indexOf("a ");
        System.out.println("secondA = " + secondA);
        int thirdA = s.indexOf("a C");
        System.out.println("thirdA = " + thirdA);
        int fourthA = s.indexOf("ava W"); // or you can use lastIndexOf.. see below
        //int fourthA = s.lastIndexOf(str: "av");
        System.out.println("fourthA = " + fourthA);
        int fifthA = s.lastIndexOf("a W");
        System.out.println("fifthA = " + fifthA);
        int sixthA = s.lastIndexOf("aw");
        System.out.println("sixthA = " + sixthA);
        int seventhA = s.lastIndexOf("a ");
        System.out.println("seventhA = " + seventhA);
        int eightA = s.lastIndexOf("a");
        System.out.println("eightA = " + eightA);
        System.out.println("===========================================");








    }
}
