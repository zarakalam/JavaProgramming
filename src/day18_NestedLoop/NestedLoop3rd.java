package day18_NestedLoop;

public class NestedLoop3rd {
    public static void main(String[] args) {

        //printed wooden spoon 20x

        for (int i = 0; i < 5; i++) {
            System.out.println("wooden spoon");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("wooden spoon");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("wooden spoon");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("wooden spoon");
        }


        System.out.println("=====================");

        // need to create a loop to repeat it 4x

        for (int j = 0; j < 4; j++) {

            for (int i = 0; i < 5; i++) {
                System.out.println("wooden spoon");
            }

        }
    }
}
