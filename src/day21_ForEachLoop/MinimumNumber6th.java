package day21_ForEachLoop;

public class MinimumNumber6th {

    public static void main(String[] args) {


        int[] numbers = {10, 5, 4, 20, 1, 3};

        int min = numbers[0];

        for(int each: numbers){
            if(each < min){
                min = each;

            }

        }

        System.out.println(min);

    }
}
