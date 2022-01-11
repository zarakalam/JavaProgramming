package day17_DoWhileLoops;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String str = "JavaJava";

        int frequency = 0;

        for (int i = 0; i < str.length()-3; i++) { // -3 was entered bc this string only has 8 total char and if you dont add -3 you will get an out of order index message when printed.
            String eachSub = str.substring(i, i+4);

            if(eachSub.equals("Java")){
                frequency++;
            }
        }

        System.out.println(frequency);

    }
}
/*


 */