package day20_Arrays;

public class AverageNumberArrays7th {
    public static void main(String[] args) {

        int[] numbers = {10, 20 , 30, 40, 50, 60};

        double sum = 0; // 0 so when you add youll get the correct math.. need a loop to get sum... double because when you do the avg itll more than likely be a double

        for (int i = 0; i < numbers.length; i++) {
            sum+= numbers[i]; // get all the numbers
        }

        double average = sum/ numbers.length;

        System.out.println("average = " + average);




    }
}
