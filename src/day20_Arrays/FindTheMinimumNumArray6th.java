package day20_Arrays;

public class FindTheMinimumNumArray6th {
    public static void main(String[] args) {

        int[] numbers = {100, 500, 40, 30, 600, 80, 90};

        int min = numbers[0];


        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] < min) {
                min = numbers[i];

            }

        }

        System.out.println(min);
    }
}
