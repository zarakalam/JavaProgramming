package day21_ForEachLoop;

public class UniqueElements9th {
    public static void main(String[] args) {

        String[] words = {"Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad"};


        for (String each : words) {
            int count = 0;
            for (String element : words) {
                if (element.equals(each)) {
                    count++;
                }

            }

            if(count ==1 ){
                System.out.println(each);
            }


        }




    }
}