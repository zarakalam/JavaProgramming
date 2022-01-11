package day08_LogicalOperatorsIfStatements;

public class Swap2Variables_WithTemporaryVariable {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        int c = b; // this was created to swap variable b into a temp variable
        b = a; // b original value is gone after this step thats why line 10 was done
        a = c;

        System.out.println("a = " + a);
        System.out.println("b = " + b);







    }
}
