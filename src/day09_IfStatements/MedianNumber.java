package day09_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {

        int a = 15,
                b = 50,
                c = 20;

        boolean aIsMedian = (a > b && a < c) || (a > c && a < b);
        boolean bIsMedian = (b > a && b < c) || (b > c && b < a);
        boolean cIsMedian = (c > b && c < a) || (c > a && c < b);

        if(aIsMedian) {
            System.out.println(a + " is the median number");
        }

            if (bIsMedian){
                System.out.println(b + " is the median number");
            }

            if (cIsMedian){
                System.out.println(c + " is the median number");
            }

        }
}

/*
2. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

            Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number
 */