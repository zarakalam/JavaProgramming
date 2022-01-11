package day25_CustomMethod_Overloading;

public class SumOfNumbers {

    public static void main(String[] args) {

        int sum= sum(12,25);
        System.out.println(sum);

        int sum3 = sumOf3Numbers(15,22,76);
        System.out.println(sum3);

    }



    public static int sum(int num1, int num2){

        int sum= num1 + num2;

        return sum;
    }

    public static int sumOf3Numbers(int num1, int num2, int num3){

        return num1+num2+num3;
    }




}
