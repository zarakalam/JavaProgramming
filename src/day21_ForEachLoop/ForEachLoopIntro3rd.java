package day21_ForEachLoop;

public class ForEachLoopIntro3rd {
    public static void main(String[] args) {


        // Regular for loop:

        int[] numbers = {10,20,30,40,50,60,70};

        for (int i = 0; i < numbers.length; i++) {
            int eachElement = numbers[i];
            System.out.println(eachElement);

        }
        System.out.println("=============================");

        for(int each : numbers ){  //left side will always be data type then the word each / the right side of the semicolon will always be the array data structure
            System.out.println(each);

        }


    }
}
