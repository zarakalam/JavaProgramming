package day17_DoWhileLoops;

public class FrequencyOfWord2 {
    public static void main(String[] args) {

        String str = "Cat Cat Dog cAT Dog caT dOg CAT";

        int frequency = 0;

        for (int i = 0; i <= str.length()-3; i++) {
            String eachSub = str.substring(i, i+3);

            if(eachSub.equalsIgnoreCase("Cat")){
                frequency++;
            }

        }

        System.out.println(frequency);
    }
}
