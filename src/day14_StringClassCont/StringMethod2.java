package day14_StringClassCont;

public class StringMethod2 {

    public static void main(String[] args) {

        //String replace method: replace(oldValue, newValue)

        String str = "Java is fun, I love learning Java";
        String str2 = str.replace("Java", "Python"); // new string obj.

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);
        System.out.println("===============================");

        String str3 = "JohnSmith@yahoo.com";
        String str4 = str3.replace("yahoo", "gmail");
        System.out.println("str3 = " + str3);
        System.out.println("str4 = " + str4);

        String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python Python";
        String sentence2 = sentence.replace("Python", ""); //"Java Java   C# C# C++ C++"

        System.out.println("sentence2 = " + sentence2);

        sentence2 = sentence2.replace("   ", " "); // want to remove the spaces between Java and C# (see above)
        System.out.println("sentence2 = " + sentence2); // method to replace spaces between Java and C#

        //replace method pract ex

        String s = "Dog Dog Dog Dog Dog Dog";
        String s2 = s.replace("Dog", "Cat");
        System.out.println("s2 = " + s2);
        System.out.println("======================================");

        //Replace First method:

        String result = "Java Java Java";
        String a = result.replaceFirst("Java", "Python");
        System.out.println("a = " + a);
        System.out.println("===========================");

        String result2 = "C# is fun, C# is cool";
        String b = result2.replaceFirst("C#", "Java");
        System.out.println("b = " + b);

        String result3 = "Java";
        String c = result3.replaceFirst("va", "vo");
        System.out.println("c = " + c);
        System.out.println("==============================");






    }
}
