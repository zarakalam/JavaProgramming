package day20_Arrays;

public class FindingTheMaxNumOfArray5th {
    public static void main(String[] args) {

        int[] numbers = {10, 5, 4, 20, 1, 0};

        int max = numbers[0];


        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > max) { //if there is an element that is greated than the current max number
                max = numbers[i]; //assigning greater number to variable max

            }

        }

        System.out.println(max);
    }
}

