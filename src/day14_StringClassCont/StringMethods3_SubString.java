package day14_StringClassCont;

public class StringMethods3_SubString {
    public static void main(String[] args) {

        //substring method :substring(beginning index, ending index); ending index will always be excluded.

        String a1 = "Cydeo School";
        //           012345....

        String b1= a1.substring(0, 4);// if you want the "o" in cydeo add + 1 after the 4
        System.out.println("b1 = " + b1);

        String c1 = a1.substring(6);
        System.out.println("c1 = " + c1);
        System.out.println("========================");

        String a2 = "Java Programming Language";
        String b2 = a2.substring(0, a2.indexOf(" ")) ; //Java
        System.out.println("b2 = " + b2);
        String c3= a2.substring(a2.indexOf(" ")+1, a2.lastIndexOf(" ")+1); // Programming
        System.out.println("c3 = " + c3);
        String d3= a2.substring(a2.lastIndexOf(" ")+1); //Language
        System.out.println("d3 = " + d3);
        System.out.println("===================================");


    }
}
