package day23_CustomArrayMethods;

public class NumbersXThroughY {

    public static void main(String[] args) {

        xToY(10, 50);

    }

    public static void xToY(int x, int y){

        for (int i = x; i < y ; i++) {
            System.out.print(i+ " ");

        }
    }
}
